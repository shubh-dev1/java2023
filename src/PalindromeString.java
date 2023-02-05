import java.util.Scanner;

public class PalindromeString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String dummy = "";
        for(int i =str.length()-1;i>=0;i--){
            dummy += str.charAt(i);
        }
        if(str.equals(dummy)){

            System.out.println("String is a palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }
    }
}
