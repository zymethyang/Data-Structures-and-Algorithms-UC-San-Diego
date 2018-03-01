import java.util.*;

public class LCM {
  
  private static int gcd_naive(int a, int b) {
	  if(a%b == 0) return b;
	  if(b%a == 0) return a;
	  while(a!=b) {
		  if(a > b) a = a - b; else b = b - a;
	  }
	  return a;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    
    int gcd = gcd_naive(a,b);
    System.out.println((long)a*(long)b/(long)gcd);
  }
}
