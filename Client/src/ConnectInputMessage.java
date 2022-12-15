import java.io.*;
import java.net.Socket;

public class ConnectInputMessage implements Runnable {
    private Socket serverConnect;
    private InputStream inputStreamServer;

    public ConnectInputMessage() throws IOException {
        serverConnect = new Socket("localhost", 8888);
        inputStreamServer = serverConnect.getInputStream();
    }

    @Override
    public void run() {
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStreamServer));
        String serverMessage;
        while (true) {
            try {
                serverMessage = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (serverMessage != null) {
                System.out.print(serverMessage + "\n");
                break;

            }

            PrintWriter out = null;
            BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));

            String userMessage = null;
            while (true) {
                System.out.print("Enter the message");
                try {
                    userMessage = inputUser.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    out = new PrintWriter(serverConnect.getOutputStream(), true);
                    out.println(userMessage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if ("exit".equals(userMessage)) {
                    break;
                }
            }
        }
    }

    public InputStream getInputStreamServer() {
        return inputStreamServer;
    }
}
