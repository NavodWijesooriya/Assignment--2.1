import javax.swing.JOptionPane;

public class Circle {
    private double radius;

    public double getArea() {
        String radiusInput = JOptionPane.showInputDialog("Enter Radius");

        radius = Double.parseDouble(radiusInput);

        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

