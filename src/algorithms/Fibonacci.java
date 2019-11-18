package algorithms;

public class Fibonacci {
    
    public long fib(long n) {
        if(n == 0 || n == 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fib(5));
        System.out.println(f.fib(6));
        System.out.println(f.fib(10));
    }
    
}
