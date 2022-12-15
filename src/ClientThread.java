import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread implements Runnable {

    Socket clientSocket;
    ChatServer chatServer;
    int numberClient; // xouep xiuexma

    public ClientThread(Socket clientSocket, ChatServer chatServer, int number) {
        this.clientSocket = clientSocket;
        this.chatServer = chatServer;
        numberClient = number;
    }

    @Override
    public void run() {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Client №" + numberClient + " is on");

        try {
            new PrintWriter(clientSocket.getOutputStream(), true).println("Client №" + numberClient + ".");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String clientMessage = null;
        while (true) {
            try {
                clientMessage = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (!"exit".equals(clientMessage)) {
                System.out.println("Client №" + numberClient + ": " + clientMessage);
                chatServer.sendMessageForAllClient(numberClient, clientMessage);
            } else {
                break;
            }
        }
    }
}

