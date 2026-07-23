package ARRAY;
import java.util.Scanner;

public class Zero_MoveToLast {

    public static void Moved_array(int array[]){
        int index = 0;
        for (int i=0; i<array.length; i++){
            if(array[i]!=0){
                array[index] = array[i];
                index++;
              
            }
        }
        while(index<array.length){
            array[index] = 0;
            index++;
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.err.println("Enter the size of the array");
        n = s.nextInt();
        int arra[] = new int[n];
        System.err.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arra[i] = s.nextInt();
        }
        s.close();
            Moved_array(arra);
            System.err.println("Array after moving zeros to the end");
            for (int i = 0; i < n; i++) {
                System.out.print(arra[i] + " ");
            }
    }

}
    