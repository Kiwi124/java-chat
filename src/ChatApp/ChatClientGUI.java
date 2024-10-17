package ChatApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatClientGUI extends JFrame {
    private JTextArea messageArea;
    private JTextField textField;
    private ChatClient client;

    public ChatClientGUI() {
        super("Chat Application");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        messageArea = new JTextArea();
        messageArea.setEditable(false);
        add(new JScrollPane(messageArea), BorderLayout.CENTER);

        textField = new JTextField();
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                client.sendMessage(textField.getText());
                textField.setText("");
            }
        });
        add(textField, BorderLayout.SOUTH);

        // Initialize and start the ChatClient
        this.client = new ChatClient("127.0.0.1", 5000);
        client.startClient();
    }

    private void onMessageReceived() {
        String message = "";
        SwingUtilities.invokeLater(() -> messageArea.append(message + "\n"));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ChatClientGUI().setVisible(true);
        });
    }
}

