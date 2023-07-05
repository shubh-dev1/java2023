package Basic;

public class PrimeNumber {

  public static boolean isPrime(int number){
    if(number ==0 || number ==1) return false;

    if(number == 2) return true;  // only even prime number

    for(int i =2;i<number/2;i++) {   // number/2 is doing because there is no need to check all number as 2*7 = 14 nd 7*2 = 14
      if( number % i == 0) return false;
    }

    return true;
  }
  public static void main(String args[]){
    System.out.println(isPrime(19));
    System.out.println(isPrime(49));
    System.out.println(isPrime(2));
  }
}
