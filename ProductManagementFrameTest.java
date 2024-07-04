import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.*;
import java.awt.*;

public class ProductManagementFrameTest {

    @SuppressWarnings("unused")
    @Test
    public void testProductManagementFrameComponents() {
        ProductManagementFrame frame = new ProductManagementFrame();

        Component[] components = frame.getContentPane().getComponents();
        assertEquals(14, components.length);

        JLabel productIDLabel = (JLabel) components[0];
        JTextField productIDField = (JTextField) components[1];
        JLabel productNameLabel = (JLabel) components[2];
        JTextField productNameField = (JTextField) components[3];
        JLabel categoryLabel = (JLabel) components[4];
        JTextField categoryField = (JTextField) components[5];
        JLabel priceLabel = (JLabel) components[6];
        JTextField priceField = (JTextField) components[7];
        JLabel stockLabel = (JLabel) components[8];
        JTextField stockField = (JTextField) components[9];
        JButton addButton = (JButton) components[11];
        JButton updateButton = (JButton) components[12];
        JButton deleteButton = (JButton) components[13];

        assertEquals("Product ID:", productIDLabel.getText());
        assertEquals("Product Name:", productNameLabel.getText());
        assertEquals("Category:", categoryLabel.getText());
        assertEquals("Price:", priceLabel.getText());
        assertEquals("Stock:", stockLabel.getText());
        assertEquals("Add Product", addButton.getText());
        assertEquals("Update Product", updateButton.getText());
        assertEquals("Delete Product", deleteButton.getText());
    }

    @Test
    public void testAddProductAction() {
        ProductManagementFrame frame = new ProductManagementFrame();

        JTextField productIDField = (JTextField) frame.getContentPane().getComponent(1);
        JTextField productNameField = (JTextField) frame.getContentPane().getComponent(3);
        JTextField categoryField = (JTextField) frame.getContentPane().getComponent(5);
        JTextField priceField = (JTextField) frame.getContentPane().getComponent(7);
        JTextField stockField = (JTextField) frame.getContentPane().getComponent(9);
        JButton addButton = (JButton) frame.getContentPane().getComponent(11);

        productIDField.setText("P001");
        productNameField.setText("Smartphone");
        categoryField.setText("Electronics");
        priceField.setText("699.99");
        stockField.setText("50");

        addButton.doClick();

        String expectedDetails = "Product Details:\n" +
                "Product ID: P001\n" +
                "Product Name: Smartphone\n" +
                "Category: Electronics\n" +
                "Price: 699.99\n" +
                "Stock: 50";

        JOptionPane.showMessageDialog(null, expectedDetails);
    }
}