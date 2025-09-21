package Questions;

import java.util.Scanner;

public class Q11_SquareRootOfNumber {

    public static int squareRoot(int n){
        if(n < 2){
            return n;
        }
        int low = 1, high = n;

        while (low <= high){
            int mid = (low + high)/2;

            if((mid * mid) == n){
                return mid;
            } else if ((mid * mid) <= n) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return high;
    }

    //for decimal
    //newton's method
    public static double sqrRoot(double n){
        double x = n;
        double root;

        while (true){
            root = 0.5 * (x + (n/x));
            if(Math.abs(root -x) < 1e-6){
                break;
            }
            x= root;
        }
        return root;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number :");
//        int n = sc.nextInt();

//        int ans = squareRoot(n);

        double n = sc.nextDouble();
        System.out.println("The Square root of " + n + ":" + sqrRoot(n));
    }
}
