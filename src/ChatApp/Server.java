package ChatApp;

import java.io.*;
import java.net.*;

// ServerSocket: These are designed to listen for incoming network requests,
// execute an action based on the request,
// and potentially send a response back to the requester.
// Socket: These are endpoints for communication between two machines.

public class Server {
    public static void main(String[] args) throws IOException{
        // Creating a server socket object and setting its port to 2000.
        ServerSocket serverSocket = new ServerSocket(2000);
        System.out.println("Server initialised! Waiting for clients...");
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connection initialised!");

    }
}