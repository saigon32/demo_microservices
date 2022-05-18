package demo;

public class Fibonacci {

    public static int fibonacciRecursion(int n){
        if (n < 2){
            return n;
        }
        return  fibonacciRecursion( n -1 ) +  fibonacciRecursion( n -2  );
    }

    public static void main(String[] args) {
       System.out.println(Fibonacci.fibonacciRecursion(5));
    }
}
