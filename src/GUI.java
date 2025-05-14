import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class GUI extends JFrame {
    private JLabel labelOutput;
    private JLabel yippee;
    private JTextField textUsername;
    private JButton buttonYES;
    private JButton buttonNO;
    public int size;

    String[] threateningMessages = {
            "in order to verify your pension, we need to confirm your bank details",
            "you must do this immediately or your pension will be cancelled. ",
            "WHAT IS YOUR PROBLEM FILL IT IN",
            "GIVE ME YOUR MONEYYYY",
            "GIMUHHH",
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
            "you DO want to give me money",
            "*loads shotgun*",
    };

    // private final int WIDGET_HEIGHT = 30; use constants for easier rearranging
    public GUI(String input, int x, int y, int size) {
        setTitle("Window title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // quit the app when we close the window
        setSize(500, 300);
        setLocation(x, y);
        setLayout(null);
        labelOutput = new JLabel(input);
        labelOutput.setBounds(50,50, 6000,30);
        labelOutput.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
        yippee = new JLabel("yippee");
        yippee.setBounds(400, 30, 400, 30);



        textUsername = new JTextField();
        textUsername.setBounds(50, 90, 200, 30);


        buttonYES = new JButton("YES");
        buttonYES.setBounds(50, 130, 100+(size*3), 30+(3*size));
        buttonYES.setFont(new java.awt.Font("Arial", Font.BOLD, 20+(2*size)));
        buttonYES.setBackground(Color.GREEN);
        buttonYES.setForeground(Color.BLACK);
        // Add an ActionListener to the button
        buttonYES.addActionListener(e -> {
            // This code will run when the button is clicked
            System.out.println("nice");
            Bank bank = new Bank();
        });


        buttonNO = new JButton("NO");
        buttonNO.setBounds(150+(5*size), 130+size, 100-(size*5), 30-size);
        buttonNO.setFont(new java.awt.Font("Comic Sans", Font.BOLD, 20-size));
        buttonNO.setBackground(Color.RED);
        buttonNO.setForeground(Color.BLACK);


        // Add an ActionListener to the button
        buttonNO.addActionListener(e -> {
            // This code will run when the button is clicked
            System.out.println("wrong choice");
            Random random = new Random();
            String message = threateningMessages[random.nextInt(threateningMessages.length)];

            if((x>750) || (y>700)){
                GUI gui = new GUI(message, 0, 0, size + 1);
            }else {
                GUI gui = new GUI(message, x + 50, y + 50, size + 1);
            }
        });

        add(labelOutput);
        add(buttonYES);
        add(buttonNO);
        add(yippee);
        setVisible(true);
        System.out.println("SEQUENCE: GUI_test created");
    }

}



