import javax.swing.JOptionPane;

public class Circle {
    
    public static double getArea(String radius){

        double rd = Double.parseDouble(radius);

        double area = rd * rd * Math.PI;

       return area;

      

    }
}

