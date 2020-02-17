import java.math.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MyCircle {
    int radius;

    private static DecimalFormat df2 = new DecimalFormat(".##");

    MyCircle()
    {

    }

    MyCircle(int radius)
    {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateDiameter(int radius)
    {
        double diameter = 2 * radius;
        return diameter;
    }

    public double calculateCircumference(int radius)
    {
        double circumference = 2 * (Math.PI * radius);
        return circumference;
    }

    public double calculateArea(int radius)
    {
        double area = (Math.pow(radius, 2) * Math.PI);
        return area;
    }

    /*@Override
    public String toString() {
        return "MyCircle{" +
                "radius=" + radius +
                '}';
    }*/

    public void showResults()
    {
        JOptionPane.showMessageDialog(null,  "Radius: = " + radius + "\nDiameter: = " + df2.format(calculateDiameter(radius)) + "\nCircumference: = " + df2.format(calculateCircumference(radius)) + "\nArea: = " + df2.format(calculateArea(radius)));
    }

}
