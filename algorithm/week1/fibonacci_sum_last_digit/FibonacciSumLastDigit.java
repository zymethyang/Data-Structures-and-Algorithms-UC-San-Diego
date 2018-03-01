import java.util.*;

public class FibonacciSumLastDigit {

    
    private static int getFibonacciLastDigitNaive(int n) {
    	if(n==0) return 0;
    	int[] f = new int[n+1];
  	  	f[0] = 0;
  	  	f[1] = 1;
  	  	int sum = f[0]+f[1];
  	  	for(int i=2;i<=n;i++) {
  	  		f[i] = f[i-1]%10 + f[i-2]%10;
  	  		sum += f[i];
  	  	}
  	  	return sum%10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciLastDigitNaive((int)n);
        
        System.out.println(s);
    }
}

