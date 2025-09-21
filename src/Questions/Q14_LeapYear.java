package Questions;

import java.util.Scanner;

public class Q14_LeapYear {

    static boolean isLeapYear(int year){
        if(year % 400 == 0){
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 ==0) {
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(isLeapYear(year)){
            System.out.println("This Year is a Leap year");
        }else {
            System.out.println("This Year is not a Leap Year");
        }
    }
}
