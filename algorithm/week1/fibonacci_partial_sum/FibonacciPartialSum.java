import java.util.*;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
        long sum = 0;


        for (long i = from; i <= to; ++i) {
            sum += getFibonacciLastDigitNaive((int)i);
        }

        return sum%10;
    }
    
    private static int getFibonacciLastDigitNaive(int n) {
    	int[] f = new int[n+1];
  	  	f[0] = 0;
  	  	f[1] = 1;
  	  	for(int i=2;i<=n;i++) {
  	  		f[i] = f[i-1]%10 + f[i-2]%10;
  	  	}
  	  	return f[n]%10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumNaive(from, to));
    }
}

