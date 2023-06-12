import javax.swing.JOptionPane;

public class Rectangle {

    public static void getArea(String width, String height) {

        double wd = Double.parseDouble(width);
        double hg = Double.parseDouble(height);

        double area = wd * hg;
        double perimeter = wd + hg;

        // JOptionPane.showMessageDialog(null,"Area is : " + area );

        // JOptionPane.showMessageDialog(null,"Perimeter : " );

        JOptionPane.showMessageDialog(null, "Area is : " + area + "\n\n" + "Perimeter is : " + perimeter);

    }
}
