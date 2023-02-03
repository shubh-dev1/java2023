import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // used to take input
        String str = sc.nextLine();
        //ouput
        System.out.println("Happy Birthday "+ str);
    }
}
