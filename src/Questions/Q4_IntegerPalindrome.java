package Questions;

import java.util.Scanner;

public class Q4_IntegerPalindrome {
    static boolean isIntPalindrome(int x){

        if(x<0){
            return false;
        }

        int reverse = 0;
        int y = x;

        while(x>0){
            reverse = (reverse * 10) + (x % 10);
            x = x/10;
        }
        return reverse == y;
    }
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
         int x = scanner.nextInt();

         if(isIntPalindrome(x)){
             System.out.println("This number is a palindrome ");
         }
         else {
             System.out.println("This number is not a palindrome");
         }
    }
}
