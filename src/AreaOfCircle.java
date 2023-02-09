import java.util.Scanner;

public class AreaOfCircle {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle to find the area");
    int radius = sc.nextInt();

    double area = 3.14 * (radius * radius);
    System.out.println("Area of teh circle is " + area);
  }
}
