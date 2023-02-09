import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]){

        // string :---     level

        String str = "level";

        String temp = "";

        for(int i =str.length()-1;i>=0;i--){
            temp = temp + str.charAt(i);
        }

        if(str.equals(temp)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }



    }
}
