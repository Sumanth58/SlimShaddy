import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("SlimShaddy Shopping Application");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        titlePanel.setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel("SlimShaddy", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 36));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel catchyLabel = new JLabel("Shop with Style and Elegance", SwingConstants.CENTER);
        catchyLabel.setFont(new Font("Serif", Font.ITALIC, 20));
        catchyLabel.setForeground(Color.ORANGE);
        catchyLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        titlePanel.add(Box.createRigidArea(new Dimension(0, 20)));
        titlePanel.add(titleLabel);
        titlePanel.add(Box.createRigidArea(new Dimension(0, 10)));
        titlePanel.add(catchyLabel);
        titlePanel.add(Box.createRigidArea(new Dimension(0, 20)));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 10, 10));
        buttonPanel.setBackground(Color.WHITE);

        JButton productManagementButton = new JButton("Product Management");
        JButton orderManagementButton = new JButton("Order Management");

        productManagementButton.setFont(new Font("SansSerif", Font.PLAIN, 16));
        productManagementButton.setBackground(Color.ORANGE);
        productManagementButton.setForeground(Color.BLACK);

        orderManagementButton.setFont(new Font("SansSerif", Font.PLAIN, 16));
        orderManagementButton.setBackground(Color.ORANGE);
        orderManagementButton.setForeground(Color.BLACK);

        productManagementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ProductManagementFrame();
            }
        });

        orderManagementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new OrderManagementFrame();
            }
        });

        buttonPanel.add(productManagementButton);
        buttonPanel.add(orderManagementButton);

        add(titlePanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
