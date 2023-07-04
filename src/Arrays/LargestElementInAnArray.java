package Arrays;

public class LargestElementInAnArray {
  public static void main(String[] args) {
   int arr[] =  {2,5,1,3,10};

     int max = 0;
     int min = 100;

     for(int i =0;i<arr.length;i++){
       if(arr[i] > max){
         max = arr[i];
       }
     }
    System.out.println("Largest element in the array is:");
    System.out.println(max);
  }
}
