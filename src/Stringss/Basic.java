package Stringss;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic {
  public static void main(String args[]){
    // Strings -- >.Objec
    // strings are immutable:


//    // declaration
//    String str1 = "Aman";
//    String str2 = " my name is aman";
//
//    System.out.println(str2);

    // user input
    // two ways 1. for only series of character
//      Scanner sc = new Scanner(System.in);
//      // Aman
//  //  String name = sc.next();  ///
//    String name2 = sc.nextLine(); // my name is aman
//    System.out.println(name2.length());
    //  String str = "b";       Stack(str)    ---->  heap("ball")
      //  str+ "a" => "ba"                          //
    //     str+ "l" => "bal"
    //    str + "l" => "ball"

//     String a = "India";
//     for(int i =0;i<a.length();i++){
//       System.out.print(a.charAt(i));
//     }


//
//    System.out.println(a.charAt(1));

//
//    String name1 = "Gurgaon";  // ascii value
//    String name = "gurgaon";

//    if(name1 == name2){
//      System.out.println("Strings are equal");
//    }else{
//      System.out.println("Strings are not equal");
//    }

    // compareTo
//     int a = name1.compareTo(name);

    /// 3 case

    // name1 > name2 == +value
    // name1 == name2 = 0
    // name1 < nanme2 = -ve value

//
//    String name1 = "Gurgaon";

//
//   if(name1.compareTo(name) == 0){
//     System.out.println("Strings are equal");
//   }else{
//     System.out.println("Strings are not equal");
//   }

//   // declaration
//    StringBuilder str = new StringBuilder("Haryana");
//    String a = "himachal";
//    System.out.println(str);
//
////    str.replace(2,3,"q");
//    str.append('4');
//
//    System.out.println(str);
////
//   name1.
//
//    }


    // substring  Shubham
//    String myName = "Shubham";
//   String a =  myName.substring(0,4);
//    System.out.println(a);
    String inputString = "jjfunny.jpg";
    String patternString = "^fun.*";

    Pattern pattern = Pattern.compile(patternString);
    Matcher matcher = pattern.matcher(inputString);

    if (matcher.find()) {
      System.out.println("Match found: ");
    } else {
      System.out.println("No match found.");
    }
    }
}
