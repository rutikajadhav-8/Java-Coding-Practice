package Questions;

import java.util.Scanner;

public class Q5_ArmstrongNumber {
    static boolean isArmstrong(int x){
        if(x<0){
            return false;
        }

        int temp =x;
        int r, sum=0;

        while(x>0){
            r = x % 10;
            x = x/10;
            sum = sum + (r * r * r);
        }
        return sum == temp;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        int x = scanner.nextInt();

        if(isArmstrong(x)){
            System.out.println("Number is a Armstrong");
        }
        else {
            System.out.println("Number is not a Armstrong");
        }
    }
}
