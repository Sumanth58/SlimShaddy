import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductManagementFrame extends JFrame {

    public ProductManagementFrame() {
        setTitle("Product Management");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        JLabel productNameLabel = new JLabel("Product Name:");
        productNameLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        JTextField productNameField = new JTextField();
        JLabel productIDLabel = new JLabel("Product ID:");
        productIDLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        JTextField productIDField = new JTextField();
        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        JTextField priceField = new JTextField();
        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        JTextField quantityField = new JTextField();
        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        JTextField categoryField = new JTextField();

        JButton addButton = new JButton("Add Product");
        addButton.setFont(new Font("SansSerif", Font.PLAIN, 14));
        addButton.setBackground(Color.BLACK);
        addButton.setForeground(Color.WHITE);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String details = "Product Details:\n" +
                        "Name: " + productNameField.getText() + "\n" +
                        "ID: " + productIDField.getText() + "\n" +
                        "Price: " + priceField.getText() + "\n" +
                        "Quantity: " + quantityField.getText() + "\n" +
                        "Category: " + categoryField.getText();
                JOptionPane.showMessageDialog(null, details);
            }
        });

        add(productNameLabel);
        add(productNameField);
        add(productIDLabel);
        add(productIDField);
        add(priceLabel);
        add(priceField);
        add(quantityLabel);
        add(quantityField);
        add(categoryLabel);
        add(categoryField);
        add(new JLabel(""));
        add(addButton);

        setVisible(true);
    }
}
