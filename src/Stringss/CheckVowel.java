package Stringss;

public class CheckVowel {

  public static boolean isVowelIsPresent(String str){
    // .*[aeiou].* it is used to find whether vowel is present in the string or not.
    return str.toLowerCase().matches(".*[aeiou].*");
  }
  public static void main(String[] args) {
    String str = "kyhbnjm";
    boolean present = isVowelIsPresent(str);

    if(present) {
      System.out.println("Vowel is present in the string");
    }else{
      System.out.println("Vowel is not present in the string");
    }
  }
}
