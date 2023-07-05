package Basic;

public class FibonachiSeries {

  public static void printFibonachi(int count){
    int a = 0;
    int b = 1;
    int c = 1;

    for(int i =1;i<=count;i++){
      System.out.print(a +",");
      a = b;
      b = c;
      c = a + b;
    }
  }
  public static void main(String[] args) {
   printFibonachi(10);
  }

}
