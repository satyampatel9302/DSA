

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        int left = 0;
        int right = ch.length - 1;

        // Two-pointer approach
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        String reverse = new String(ch);

        System.out.println("Reversed string: " + reverse);

        sc.close();
    }
}
