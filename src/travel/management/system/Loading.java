package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable {
    Thread t;
    JProgressBar bar;
    String username;

    public void run() {
        try {
            for (int i = 1; i <= 100; i++) { // Loop from 1 to 100
                bar.setValue(i); // Set the progress bar value directly
                Thread.sleep(50); // Sleep to simulate loading
            }

            // After loading is complete, transition to Dashboard
            SwingUtilities.invokeLater(() -> {
                setVisible(false); // Hide the loading screen
                dispose(); // Dispose of the loading frame
                new Dashboard(username); // Create a new Dashboard instance
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Loading(String username) {
        this.username = username;
        t = new Thread(this);

        setBounds(500, 200, 650, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("Travel and Tourism Application");
        text.setBounds(50, 20, 600, 40);
        text.setForeground(new Color(133, 193, 233));
        text.setFont(new Font("Raleway", Font.BOLD, 35));
        add(text);

        bar = new JProgressBar();
        bar.setBounds(150, 100, 300, 35);
        bar.setStringPainted(true);
        add(bar);

        JLabel loading = new JLabel("Loading, Please wait...");
        loading.setBounds(230, 130, 150, 30);
        loading.setForeground(Color.BLACK);
        loading.setFont(new Font("Raleway", Font.BOLD, 16));
        add(loading);

        JLabel lblusername = new JLabel("Welcome " + username);
        lblusername.setBounds(20, 310, 400, 40);
        lblusername.setForeground(new Color(133, 193, 233));
        lblusername.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lblusername);

        t.start(); // Start the loading thread

        setVisible(true);
    }

    public static void main(String[] args) {
        new Loading("User");
    }
}