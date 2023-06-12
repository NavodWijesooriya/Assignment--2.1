

import javax.swing.JOptionPane;

public class Triangle {
    private double base;
    private double height;

    public double getArea() {
        String baseInput = JOptionPane.showInputDialog("Enter Base");
        String heightInput = JOptionPane.showInputDialog("Enter Height");

        base = Double.parseDouble(baseInput);
        height = Double.parseDouble(heightInput);

        return 0.5 * base * height;
    }

    public double getPerimeter() {
        return base * 3;
    }
}