import javax.swing.JOptionPane;

public class Rectangle {
    private double width;
    private double height;

    public double getArea() {
        String widthInput = JOptionPane.showInputDialog("Enter Width");
        String heightInput = JOptionPane.showInputDialog("Enter Height");

        width = Double.parseDouble(widthInput);
        height = Double.parseDouble(heightInput);

        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}