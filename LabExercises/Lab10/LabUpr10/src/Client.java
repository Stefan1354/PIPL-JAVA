import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    void start() {
        try {
            Socket server = new Socket("localhost", 1555);
            Scanner in = new Scanner(server.getInputStream());
            PrintStream out = new PrintStream(server.getOutputStream());

            Thread readerThread = new Thread(() ->
            {
                while (true) {
                    if (in.hasNextLine()) {
                        System.out.println(in.nextLine());
                    }
                }
            });

            Thread writerThread = new Thread(() ->
            {
                Scanner console = new Scanner(System.in);
                System.out.println("Enter name:");
                String myName = console.nextLine();
                while (true) {
                    out.println(myName + ": " + console.nextLine());


                }
            });
            readerThread.start();
            writerThread.start();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}