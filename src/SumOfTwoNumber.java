import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Please Enter second number :");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of "+num1+" and "+num2 +" is "+sum);


    }
}
