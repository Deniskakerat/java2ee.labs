import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.TreeMap;

public class ChatServer implements Runnable {
    private Map<Integer, Socket> mapClient = new TreeMap<Integer, Socket>();

    @Override
    public void run() {
        ServerSocket server = null;
        try {
            server = new ServerSocket(8888);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Server is on");
        int numberClient = 1;
        Socket client = null;
        while (true) {
            try {
                client = server.accept();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Thread clientThread = new Thread(new ClientThread(client, this, numberClient));
            clientThread.setDaemon(true);
            clientThread.start();
            mapClient.put(numberClient, client);
            numberClient++;
        }
    }

    public void sendMessageForAllClient(int numberClient, String clientMessage) {
        for (int i = 1; i < mapClient.size(); i++) {
            if (numberClient != i) {
                System.out.println("Sending message to Client " + numberClient + "\n");
                BufferedWriter outputUser = null;
                try {
                    outputUser = new BufferedWriter(new OutputStreamWriter(mapClient.get(i).getOutputStream()));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    outputUser.write("Clirnt" + numberClient + ": " + clientMessage + "\n Input message");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}