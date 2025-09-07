package Questions;

import java.util.Locale;
import java.util.Scanner;

public class Q9_RepeatedCharacter {
    static void repeatedCh(String str){
        int count = 0;
        char[] ch = str.toLowerCase().toCharArray();

        for(int i=0; i<ch.length; i++){
            for(int j= i+1; j<ch.length; j++){
                if(ch[i] == ch[j]){
                    System.out.print( ch[j] + " ");
                    count ++;
                }
            }
        }

        System.out.println("\n Total Repeated Characters are : " + count);

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.next();

        repeatedCh(str);
    }
}
