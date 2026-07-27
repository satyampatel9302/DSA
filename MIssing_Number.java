public class MIssing_Number {

    public static void main (String args[]){
        int arr [] = {1,2,3,5};
        int sum =0;
        for (int i =0; i<arr.length; i++){
             sum += arr[i];
        }

         int total = arr.length+1;
         int actual_sum = total * (total + 1)/2;

        System.err.println(actual_sum - sum);
        System.err.println(sum);
    }
}
