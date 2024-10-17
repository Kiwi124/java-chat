package ChatApp;

import java.io.*;
import java.net.*;

// ServerSocket: These are designed to listen for incoming network requests,
// execute an action based on the request,
// and potentially send a response back to the requester.
// Socket: These are endpoints for communication between two machines.

public class ChatClient{
    public static void main(String[] args) throws IOException {
        // Creating a socket object and setting its host and port.
        Socket socket = new Socket("localhost", 5000);
        System.out.println("Connection to the server initialised!");

    }
}