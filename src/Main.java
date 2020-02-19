import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int radius;

        MyCircle myCircle = new MyCircle();
        Scanner input = new Scanner(System.in);
        MyCircle myCircle2 = new MyCircle(0);

        radius = Integer.parseInt(JOptionPane.showInputDialog("Please enter circle radius"));

        myCircle.setRadius(radius);
        myCircle.calculateDiameter(radius);
        myCircle.calculateCircumference(radius);
        myCircle.calculateArea(radius);

        myCircle.showResults();

        radius = Integer.parseInt(JOptionPane.showInputDialog("Please enter radius of second circle"));

        myCircle2.setRadius(radius);
        myCircle2.calculateDiameter(radius);
        myCircle2.calculateCircumference(radius);
        myCircle2.calculateArea(radius);

        myCircle2.showResults();

        /*JOptionPane.showMessageDialog(null, myCircle.toString());*/
        System.out.println(myCircle.toString());
        System.out.println(myCircle2.toString());
        System.out.println("Clayton Claassens was here");
        System.out.println("Clayton Claassens was here");
        System.out.println("Clayton Claassens was here");
        System.out.println("Clayton Claassens was here");
        System.out.println("Clayton Claassens was here");
    }
}
