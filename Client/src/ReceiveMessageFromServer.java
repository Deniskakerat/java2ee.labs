import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReceiveMessageFromServer implements Runnable {
    private InputStream inputStreamServer;

    ReceiveMessageFromServer(InputStream inputStream) {
        inputStreamServer = inputStream;
    }

    public void run() {
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStreamServer));
        String serverMessage = null;

        while (!"exit".equalsIgnoreCase(serverMessage)) {
            try {
                serverMessage = in.readLine();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            if (serverMessage != null) {
                System.out.print("\n" + serverMessage + "\nEnter the message: ");
            }
        }
    }
}
