import javax.swing.JOptionPane;

public class Triangle {

    public static void getArea(String width, String height) {

        double wd = Double.parseDouble(width);
        double hg = Double.parseDouble(height);

        double area = wd * hg / 2;

        JOptionPane.showMessageDialog(null,"Area is : " + area);
    }
}