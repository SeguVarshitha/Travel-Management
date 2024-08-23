package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;

public class Paytm extends JFrame implements ActionListener {
    
    Paytm() {
        setBounds(500, 200, 800, 600);
        setTitle("Paytm Payment");

        // Create a label to inform the user
        JLabel label = new JLabel("Click the button below to make a payment:");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        add(label, BorderLayout.CENTER);

        // Create a button to open the Paytm payment page
        JButton payButton = new JButton("Open Paytm Payment");
        payButton.setFont(new Font("Arial", Font.BOLD, 16));
        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openPaytmPayment();
            }
        });
        add(payButton, BorderLayout.SOUTH);

        // Create a back button
        JButton back = new JButton("Back");
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);
        add(back, BorderLayout.NORTH);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void openPaytmPayment() {
        try {
            Desktop.getDesktop().browse(new URI("https://paytm.com/rent-payment"));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to open Paytm payment page.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Payment(); // Assuming you have a Payment class to go back to
    }

    public static void main(String[] args) {
        new Paytm();
    }
}
