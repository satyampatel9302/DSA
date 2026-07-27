package ARRAY;
   import java.util.Scanner;
                   
                   public class Reverse_Array_By_Half {
                   
                      public static int[] Reverse_Array_ByHalf(int arr[]){
                       int last = arr.length;
                   
                       for (int i =0; i<arr.length/2; i++){
                           int temp = arr[i];
                           arr[i] = arr[arr.length-1-i];
                           arr[arr.length-1-i] = temp;
                       }
                       return arr ;
                       
                      }
                   
                     public static void main(String args[]){
                       int  n;
                       System.err.println("ENter you array size ");
                       Scanner sc = new Scanner(System.in);
                       n = sc.nextInt();
                       System.err.println("Enter you array elements");
                       int arr[] = new int[n];
                       for (int i = 0; i<n; i++){
                           arr[i] = sc.nextInt();
                       }
                       Reverse_Array_ByHalf(arr);
                       System.err.println("Reverse Array");
                       for (int rev : arr){
                           System.err.println(rev);
                       }
                     }
                   }
                                   