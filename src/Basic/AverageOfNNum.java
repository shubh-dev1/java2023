import java.sql.SQLOutput;
import java.util.Scanner;

public class AverageOfNNum {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Total number of which you want to find the average");
    int num = sc.nextInt();
    int sum = 0;
    for(int i = 1;i<= num;i++){
      System.out.println("Enter "+ i+"Number");
      int count = sc.nextInt();
      sum += count;
    }
    System.out.println("Average of "+num+" number is"+ (float)(sum/num));
  }
}
