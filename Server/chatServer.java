import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class chatServer {
    public static void main(String[] args) {
        int port = 9500;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Chat server started on port " + port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected: " + socket.getInetAddress());
                handleClient(socket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket socket) {
        try (DataInputStream in = new DataInputStream(socket.getInputStream());
             DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {
            String message;
            while (true) {
                message = in.readUTF(); // Read message from client
                System.out.println("Client says: " + message);
                if (message.equalsIgnoreCase("bye")) {
                    out.writeUTF("Goodbye!");
                    break; // Exit loop if client says "bye"
                }
                // Simple response logic
                String response = "Server: " + message;
                out.writeUTF(response); // Send response to client
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
