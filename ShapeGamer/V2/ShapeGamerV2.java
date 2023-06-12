import javax.swing.JOptionPane;

public class ShapeGamerV2 {

    public static void main(String args[]) {

        String option = JOptionPane.showInputDialog("Select A Shape\n\n1 For Rectangle\n2 For Circle\n3 For Triangle");

        // option = "1" "1" ! = 1

        // option = "2" "2" ! = 2

        int op = Integer.parseInt(option);

        if (op == 1) {
            String width = (JOptionPane.showInputDialog("Enter Width"));
            String height = (JOptionPane.showInputDialog("Enter Height"));

            Rectangle.getArea(width, height);

        }

        if (op == 2) {
            double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter Radius"));
            double area = Math.PI * radius * radius;
            double perimeter = 2 * (Math.PI * radius);

            JOptionPane.showMessageDialog(null, "Area is : " + area + "\n\n" + "Perimeter is : " + perimeter);
        }

        if (op == 3) {

            double wd = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Width"));
            double hg = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Height"));

            double area = wd * hg / 2;

            JOptionPane.showMessageDialog(null, "Area is : " + area);

        }

    }
}