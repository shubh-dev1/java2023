import java.util.Scanner;

public class FactorialProgram {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number for the Factorial:");
    int numForFactorial = sc.nextInt();

    int fact = 1;
// run the loop from 1 to the number of which you want to find factorial
    for (int i = 1; i <= numForFactorial; i++) {
      fact *= i;
    }
    System.out.println("Factorial of " +numForFactorial+ " is "+fact);
  }
}
