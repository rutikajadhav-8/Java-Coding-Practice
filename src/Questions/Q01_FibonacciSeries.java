package Questions;

public class Q01_FibonacciSeries {

    static void fibonacci(int n){
        int a = 0, b = 1;
        for(int i=0; i<n; i++){
            System.out.print( a + " ");

            //swap
            int c = b + a;
            a = b;
            b = c;
        }
    }

    public static void main(String[]args){

        int n = 5;
        fibonacci(n);

    }
}
