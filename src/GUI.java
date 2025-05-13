import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class GUI extends JFrame {
    private JLabel labelOutput;
    private JTextField textUsername;
    private JButton buttonYES;
    private JButton buttonNO;

    String[] threateningMessages = {
            "in order to verify your pension, we need to confirm your bank details",
            "you must do this immediately or your pension will be cancelled. ",
            "WHAT IS YOUR PROBLEM FILL IT IN",
            "GIVE ME YOUR MONEYYYY",
            "GIMUHHH",
            "ill draw you pregnant.",
            "my name is calllum watson and im a loser",
            "thats gay",
            "please",
            "pretty please",
            "i'm begging please ",
            "i'll pay you ",
            "that's right i'll pay you to give me money",
            "PLEASE OMG ",
            "I TAKE CASHAPP",
            "WE ACCEPT BITCOIN",
            "VENMO ME ",
            "OMG IM BEGGING PLEASE PLEASE PLEASE",
            "ID ACCEPT OLD CENTURY NICKELS",
            "monopoly money not accepted",
            "UR BANNED",
            "I HOPE YOU STEP ON LEGO",
            "PLEASE OH MY DAYS",
            "you DO want to give me money"
    };

    // private final int WIDGET_HEIGHT = 30; use constants for easier rearranging
    public GUI(String input, int x, int y) {
        setTitle("Window title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // quit the app when we close the window
        setSize(500, 300);
        setLocation(x, y);
        setLayout(null);
        labelOutput = new JLabel(input);
        labelOutput.setBounds(50,50, 6000,30);
        labelOutput.setFont(new java.awt.Font("Arial", Font.BOLD, 20));


        textUsername = new JTextField();
        textUsername.setBounds(50, 90, 200, 30);


        buttonYES = new JButton("YES");
        buttonYES.setBounds(50, 130, 100, 30);
        buttonYES.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
        buttonYES.setBackground(Color.GREEN);
        buttonYES.setForeground(Color.BLACK);
        // Add an ActionListener to the button
        buttonYES.addActionListener(e -> {
            // This code will run when the button is clicked
            System.out.println("nice");
            Bank bank = new Bank();
        });


        buttonNO = new JButton("NO");
        buttonNO.setBounds(150, 130, 100, 30);
        buttonNO.setFont(new java.awt.Font("Comic Sans", Font.BOLD, 20));
        buttonNO.setBackground(Color.RED);
        buttonNO.setForeground(Color.BLACK);
        // Add an ActionListener to the button
        buttonNO.addActionListener(e -> {
            // This code will run when the button is clicked
            System.out.println("wrong choice");
            Random random = new Random();
            String message = threateningMessages[random.nextInt(threateningMessages.length)];
            GUI gui = new GUI(message, x+50, y+50);
        });

        add(labelOutput);
        add(textUsername);
        add(buttonYES);
        add(buttonNO);
        setVisible(true);
        System.out.println("SEQUENCE: GUI_test created");
    }


}



