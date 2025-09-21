package Questions;

import java.util.Scanner;

public class Q07_ReverseString {
    // Using for loop
    static String reverseStr(String str){
       String r =" ";
       char ch ;

       for(int i =0 ; i<str.length(); i++){
           ch = str.charAt(i);
           r = ch + r;
       }
       return r;
    }

    //Using StringBuilder
    static void reverseStr2(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println("Reverse String is : " + sb);
    }

    // Recursive method
    static String reverseStr3(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverseStr3(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

//        System.out.println("Reverse string is : " +reverseStr(str) );
//        reverseStr2(str);
        System.out.println("Reverse string is : " +reverseStr3(str) );

    }
}
