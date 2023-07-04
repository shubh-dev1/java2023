package Oops;

public class Basic extends InheritMe {
  public static void main(String[] args) {
    // store 5 roll nos

    int [] numbers = new int[5];

    // store 5 names
    String [] names = new String[5];

    // data of 5 students : {roll no. ,name, marks}

    int [] rno = new int[5];
    String [] name = new String[5];
    float [] marks = new float[5];
    Basic b = new Basic();
    b.setNameOfTheCompany("Google");
    String companyName = b.getNameOfTheCompany();
    System.out.println(companyName);

    // class is a grouped named of properties and functions





  }
}
