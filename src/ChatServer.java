import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ChatServer implements Runnable {
    private final Map<Integer, Socket> mapClient = new HashMap();

    public ChatServer() {
    }

    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(8887);
            System.out.println("Waiting for new client...");
            int numClient = 1;

            while(true) {
                Socket client = serverSocket.accept();
                Thread clientThread = new Thread(new ClientThread(client, this, numClient));
                clientThread.setDaemon(true);
                clientThread.start();
                this.mapClient.put(numClient, client);
                ++numClient;
            }
        } catch (IOException var5) {
            System.out.println(var5.getMessage());
        }
    }

    public void clientExitedChat(int n) {
        this.mapClient.remove(n);
    }

    public void sendMessageForAllClient(int numClient, String clientMessage) {
        Iterator var3 = this.mapClient.keySet().iterator();

        while(var3.hasNext()) {
            int i = (Integer)var3.next();
            if (numClient != i) {
                System.out.println("Sending message to client " + i + "...");

                try {
                    (new PrintWriter(((Socket)this.mapClient.get(i)).getOutputStream(), true)).println("Client " + numClient + ": " + clientMessage);
                } catch (IOException var6) {
                    System.out.println(var6.getMessage());
                }
            }
        }

    }
}