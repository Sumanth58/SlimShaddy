import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.*;
import java.awt.*;

public class OrderManagementFrameTest {

    @SuppressWarnings("unused")
    @Test
    public void testOrderManagementFrameComponents() {
        OrderManagementFrame frame = new OrderManagementFrame();

        Component[] components = frame.getContentPane().getComponents();
        assertEquals(14, components.length);

        JLabel orderIDLabel = (JLabel) components[0];
        JTextField orderIDField = (JTextField) components[1];
        JLabel customerNameLabel = (JLabel) components[2];
        JTextField customerNameField = (JTextField) components[3];
        JLabel productIDLabel = (JLabel) components[4];
        JTextField productIDField = (JTextField) components[5];
        JLabel quantityLabel = (JLabel) components[6];
        JTextField quantityField = (JTextField) components[7];
        JLabel orderDateLabel = (JLabel) components[8];
        JTextField orderDateField = (JTextField) components[9];
        JButton placeOrderButton = (JButton) components[11];
        JButton cancelOrderButton = (JButton) components[12];
        JButton viewOrderButton = (JButton) components[13];

        assertEquals("Order ID:", orderIDLabel.getText());
        assertEquals("Customer Name:", customerNameLabel.getText());
        assertEquals("Product ID:", productIDLabel.getText());
        assertEquals("Quantity:", quantityLabel.getText());
        assertEquals("Order Date:", orderDateLabel.getText());
        assertEquals("Place Order", placeOrderButton.getText());
        assertEquals("Cancel Order", cancelOrderButton.getText());
        assertEquals("View Orders", viewOrderButton.getText());
    }

    @Test
    public void testPlaceOrderAction() {
        OrderManagementFrame frame = new OrderManagementFrame();

        JTextField orderIDField = (JTextField) frame.getContentPane().getComponent(1);
        JTextField customerNameField = (JTextField) frame.getContentPane().getComponent(3);
        JTextField productIDField = (JTextField) frame.getContentPane().getComponent(5);
        JTextField quantityField = (JTextField) frame.getContentPane().getComponent(7);
        JTextField orderDateField = (JTextField) frame.getContentPane().getComponent(9);
        JButton placeOrderButton = (JButton) frame.getContentPane().getComponent(11);

        orderIDField.setText("O001");
        customerNameField.setText("Alice");
        productIDField.setText("P002");
        quantityField.setText("2");
        orderDateField.setText("2023-07-05");

        placeOrderButton.doClick();

        String expectedDetails = "Order Details:\n" +
                "Order ID: O001\n" +
                "Customer Name: Alice\n" +
                "Product ID: P002\n" +
                "Quantity: 2\n" +
                "Order Date: 2023-07-05";

        JOptionPane.showMessageDialog(null, expectedDetails);
    }
}