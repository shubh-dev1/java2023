package Searching;

public class Basic {
  static int linearSearch(int arr[],int target){
    if(arr.length == 0) return -1;
    for(int i =0;i<arr.length;i++){
      if(arr[i] == target) return i;
    }
    return -1;
  }
  public static void main(String[] args) {
    // Searching
    int arr[] =  {2,9,8,5,7,4};
    int target = 15;
    System.out.println(linearSearch(arr,target));

  }
}
