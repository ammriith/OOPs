import java.util.Scanner;
public class AreaCalculator
{ 
public static void area(int side) {
System.out.println("Area of Square: " + (side * side));
}
public static void area(int length, int breadth) 
{
System.out.println("Area of Rectangle: " + (length * breadth));
}
public static void area(double radius) 
{
System.out.println("Area of Circle: " + (Math.PI * radius * radius));
}
public static void area(double base, double height) 
{
System.out.println("Area of Triangle: " + (0.5 * base * height));
}
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the side of the square: ");
int side = scanner.nextInt();
area(side);
System.out.println("Enter length and breadth of the rectangle: ");
int length = scanner.nextInt();
int breadth = scanner.nextInt();
area(length, breadth);
System.out.println("Enter radius of the circle: ");
double radius = scanner.nextDouble();
area(radius);
System.out.println("Enter base and height of the triangle: ");
double base = scanner.nextDouble();
double height = scanner.nextDouble();
area(base, height);
scanner.close();
}
}
