package Questions;

import java.util.Scanner;

public class Q10_GCD_TwoNumbers {
    static int GCD(int a, int b){
        if(b == 0){
            return a;
        }

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number :" );
        int a = sc.nextInt();

        System.out.println("Enter second Number :");
        int b = sc.nextInt();

        System.out.println("GCD of " + a + " and " + b + " is " + GCD(a, b) );

    }
}
