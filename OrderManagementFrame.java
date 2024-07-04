import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderManagementFrame extends JFrame {

    public OrderManagementFrame() {
        setTitle("Order Management");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        JLabel orderIDLabel = new JLabel("Order ID:");
        orderIDLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        JTextField orderIDField = new JTextField();
        JLabel customerNameLabel = new JLabel("Customer Name:");
        customerNameLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        JTextField customerNameField = new JTextField();
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        JTextField addressField = new JTextField();
        JLabel contactLabel = new JLabel("Contact:");
        contactLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        JTextField contactField = new JTextField();
        JLabel dateLabel = new JLabel("Order Date:");
        dateLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        JTextField dateField = new JTextField();

        JButton viewOrderButton = new JButton("View Order");
        viewOrderButton.setFont(new Font("SansSerif", Font.PLAIN, 14));
        viewOrderButton.setBackground(Color.BLACK);
        viewOrderButton.setForeground(Color.WHITE);

        viewOrderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String details = "Order Details:\n" +
                        "Order ID: " + orderIDField.getText() + "\n" +
                        "Customer Name: " + customerNameField.getText() + "\n" +
                        "Address: " + addressField.getText() + "\n" +
                        "Contact: " + contactField.getText() + "\n" +
                        "Order Date: " + dateField.getText();
                JOptionPane.showMessageDialog(null, details);
            }
        });

        add(orderIDLabel);
        add(orderIDField);
        add(customerNameLabel);
        add(customerNameField);
        add(addressLabel);
        add(addressField);
        add(contactLabel);
        add(contactField);
        add(dateLabel);
        add(dateField);
        add(new JLabel(""));
        add(viewOrderButton);

        setVisible(true);
    }
}
