package Questions;

import java.util.Scanner;

public class Q6_Factorial{
    //Iterative method
    static int factorial(int n){
      int fact = 1;
      for(int i=1; i<=n; i++){
          fact *= i;
      }
      return fact;
    }

    //Recursive method
    static int factorial2(int n){

        if(n == 0){
            return 1;
        }

        return n * factorial2(n-1);

    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scanner.nextInt();

//        System.out.println(" Factorial of "+ n + " is : " + factorial(n));
        System.out.println(" Factorial of "+ n + " is : " + factorial2(n));

    }
}
