import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Bank extends JFrame {
    private JLabel labelOutput;
    private JTextField CardNumber;
    private JTextField Expiry;
    private JTextField CVVnum;
    private JTextField userName;
    private JButton buttonPay;

    public Bank() {
        setTitle("PAY ME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLayout(null);
        setLocation(600, 100);

        // Title label
        labelOutput = new JLabel("PAY HERE:");
        labelOutput.setFont(new Font("Arial", Font.BOLD, 36));
        labelOutput.setBounds(150, 30, 300, 40);

        // Card Number
        JLabel labelCardNumber = new JLabel("Card Number:");
        labelCardNumber.setBounds(50, 100, 120, 25);

        CardNumber = new JTextField();
        CardNumber.setBounds(180, 100, 250, 30);

        // Expiry Date
        JLabel labelExpiry = new JLabel("Expiry (MM/YY):");
        labelExpiry.setBounds(50, 150, 120, 25);

        Expiry = new JTextField();
        Expiry.setBounds(180, 150, 100, 30);

        // CVV
        JLabel labelCVV = new JLabel("CVV:");
        labelCVV.setBounds(50, 200, 120, 25);

        CVVnum = new JTextField();
        CVVnum.setBounds(180, 200, 60, 30);

        // Name on Card
        JLabel labelName = new JLabel("Name on Card:");
        labelName.setBounds(50, 250, 120, 25);

        userName = new JTextField();
        userName.setBounds(180, 250, 250, 30);

        // Pay Button
        buttonPay = new JButton("PAY NOW");
        buttonPay.setBounds(150, 330, 200, 50);
        buttonPay.setBackground(Color.GREEN);
        buttonPay.setForeground(Color.WHITE);
        buttonPay.setFont(new Font("Arial", Font.BOLD, 20));

        // Click action
        buttonPay.addActionListener((ActionEvent e) -> {
            System.out.println("payment successful");
        });

        add(labelOutput);
        add(labelCardNumber);
        add(CardNumber);
        add(labelExpiry);
        add(Expiry);
        add(labelCVV);
        add(CVVnum);
        add(labelName);
        add(userName);
        add(buttonPay);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Bank();
    }
}