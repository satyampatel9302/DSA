package ARRAY;
// FIND A LARGEST ELEMENT OF THE ARRAY

import java.util.Scanner;

public class FInd_largest {

    public static void main (String args[]){
    System.err.println("Enter your array size");
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
      int arr[] = new int[n];
    for (int i =0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    
    int largest = arr[0];

    for (int i= 1; i<arr.length; i++){
       if (arr[i] > largest){
         largest = arr[i];
         
       }
    }
    System.err.println("Largest Number is " +arr[0]);


    }
}