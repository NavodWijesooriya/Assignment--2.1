import javax.swing.JOptionPane;

class Triangle {
    double base;
    double height;
    double area;
    double perimeter;

    public void calculateAreaAndPerimeter() {
        
        String baseInput = JOptionPane.showInputDialog("Enter Base");
        String heightInput = JOptionPane.showInputDialog("Enter Height");

        base = Double.parseDouble(baseInput);
        height = Double.parseDouble(heightInput);
        
        area = 0.5 * base * height;
        perimeter = base * 3;
    
        JOptionPane.showMessageDialog(null, "Area: " + area + "\nPerimeter: " + perimeter);
    }
}

