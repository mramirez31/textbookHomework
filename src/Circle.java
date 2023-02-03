/**
 * @Class: Circle
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Date: January 26, 2023
 * Description: This program will create a code that will
 * compute the area and perimeter of a circle with
 * the radius of 9.5 given to us and the formula given to us.
 */

public class Circle {
    public static void main(String[] args) {
        double radius = 9.5;
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;
        System.out.println("The area of the circle is " + area);
        System.out.println("The perimeter of the circle is " + perimeter);
    }
}