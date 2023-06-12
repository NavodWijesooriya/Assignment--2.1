
import javax.swing.JOptionPane;

public class ShapeGamerV4{

    public static void main(String[] args) {
        
        while (true) {
            String option = JOptionPane.showInputDialog("Select a shape:\n1 for Area of Rectangle\n2 for Triangle\n3 for Circle");
            int opcode = Integer.parseInt(option);

            double perimeter = 0.0;
            double area = 0.0;

            if (opcode == 1) {
                Rectangle rectangle = new Rectangle();
                area = rectangle.getArea();
                perimeter = rectangle.getPerimeter();
            } 
            
            else if (opcode == 2) {
                Triangle triangle = new Triangle();
                area = triangle.getArea();
                perimeter = triangle.getPerimeter();
            } 
            
            else if (opcode == 3) {
                Circle circle = new Circle();
                area = circle.getArea();
                perimeter = circle.getPerimeter();
            }

            JOptionPane.showMessageDialog(null, "Area: " + area + "\nPerimeter: " + perimeter);
        }
    }
}