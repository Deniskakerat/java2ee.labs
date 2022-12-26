import java.io.IOException;

public class ChatClient {
    public static void main(String[] args) throws IOException {

        ConnectInputMessage connectWithServer = new ConnectInputMessage();
        Thread threadConnectInputMessage = new Thread(connectWithServer);
        threadConnectInputMessage.start();

        ReceiveMessageFromServer receiveMessage = new ReceiveMessageFromServer(connectWithServer.getInputStreamServer());
        Thread threadReceiveMessage = new Thread(receiveMessage);
        threadReceiveMessage.start();
    }
}
