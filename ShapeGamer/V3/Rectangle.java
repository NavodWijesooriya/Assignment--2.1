import javax.swing.JOptionPane;

class Rectangle {
    double width;
    double height;
    double area;
    double perimeter;

    public void calculateAreaAndPerimeter() {
        
        String widthInput = JOptionPane.showInputDialog("Enter Width");
        String heightInput = JOptionPane.showInputDialog("Enter Height");

        width = Double.parseDouble(widthInput);
        height = Double.parseDouble(heightInput);

        area = width * height;
        perimeter = 2 * (width + height);
    
        JOptionPane.showMessageDialog(null, "Area: " + area + "\nPerimeter: " + perimeter);
    }
}
