import java.util.Scanner;

public class RupeesToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rupee :");
        float rupee = sc.nextFloat();
        float usd;

        usd = rupee/83;
        System.out.println("$"+ usd);
    }
}
