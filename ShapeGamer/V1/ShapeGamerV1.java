import javax.swing.JOptionPane;

public class ShapeGamerV1 {

    public static void main(String args[]) {

        String option = JOptionPane.showInputDialog("Select a Shape\n\n1 for Rectangle\n2 for Circle");

        // option = "1"      "1" ! = 1

        // option = "2"      "2" ! = 2

        int op = Integer.parseInt (option );

        if( op == 1) {

            double width = Double.parseDouble(JOptionPane.showInputDialog("Enter Width"));

            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height"));

            double area = width * height;
            double perimeter = 2 * (width + height);

            JOptionPane.showMessageDialog(null, "Area is : "+area +"\n\n" + "Perimeter is : " + perimeter);


        }

        if(op == 2) {

            double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter Radius"));

        

            double area = Math.PI * radius * radius;
            double perimeter = 2 * (Math.PI * radius);

            JOptionPane.showMessageDialog(null, "Area is : "+area +"\n\n" + "Perimeter is : " + perimeter);



        }
        
    }
}