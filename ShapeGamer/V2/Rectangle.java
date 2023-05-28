import javax.swing.JOptionPane;

public class Rectangle {
    
    public static void getArea(String width, String height){

        double wd = Double.parseDouble(width);
        double hg = Double.parseDouble(height);

        double area = wd * hg;

        JOptionPane.showMessageDialog(null,"Area is : " + area);
    }
}
