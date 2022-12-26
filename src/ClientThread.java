import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread implements Runnable {
    private final Socket clientSocket;
    private final ChatServer chatServer;
    private final int numClient;

    public ClientThread(Socket clientSocket, ChatServer chatServer, int numClient) {
        this.clientSocket = clientSocket;
        this.chatServer = chatServer;
        this.numClient = numClient;
    }

    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
            System.out.println("Client " + this.numClient + " has been connected.");
            (new PrintWriter(this.clientSocket.getOutputStream(), true)).println("Client " + this.numClient);

            while(true) {
                String clientMessage = in.readLine();
                if ("exit".equalsIgnoreCase(clientMessage)) {
                    System.out.println("Client " + this.numClient + " has been disconnected.");
                    this.chatServer.clientExitedChat(this.numClient);
                    in.close();
                    this.clientSocket.close();
                    break;
                }

                System.out.println("Client " + this.numClient + " has sent message: " + clientMessage);
                this.chatServer.sendMessageForAllClient(this.numClient, clientMessage);
            }
        } catch (IOException var3) {
            System.out.println(var3.getMessage());
        }

    }
}

