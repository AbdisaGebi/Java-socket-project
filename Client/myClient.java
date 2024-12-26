import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class myClient {
    public static void main(String[] args) {
        String host = "localhost"; // Corrected "local host" to "localhost"
        int port = 9500;
        try (Socket socket = new Socket(host, port);
             DataInputStream in = new DataInputStream(socket.getInputStream());
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             Scanner scanner = new Scanner(System.in)) {
             
            System.out.println("Connected to chat server.");
            String message;
            while (true) {
                System.out.print("You: ");
                message = scanner.nextLine(); // Read user input
                out.writeUTF(message); /*UTF (Unicode Transformation Format):
 UTF is a way of encoding characters in Unicode.*/
                String response = in.readUTF(); // Read response from server
                System.out.println(response); // Print server response
                if (message.equalsIgnoreCase("bye")) {
                    break; // Exit loop if user says "bye"
                }
            }
        } catch (Exception e) {
            System.out.println("error...myclient can't connect to the server");
        }
    }
}
