package Questions;

import java.util.Scanner;

public class Q3_StringPalindrome {

    static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = scanner.next();

        if(isPalindrome(str)){
            System.out.println("String is a Palindrome");
        }
        else {
            System.out.println("String is not a Palindrome");
        }


    }
}
