import javax.swing.JOptionPane;

class Circle {
    double radius;
    double area;
    double perimeter;

    public void calculateAreaAndPerimeter() {
        
        String radiusInput = JOptionPane.showInputDialog("Enter Radius");
        radius = Double.parseDouble(radiusInput);
        
        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;
    
        JOptionPane.showMessageDialog(null, "Area: " + area + "\nPerimeter: " + perimeter);
    }
}


