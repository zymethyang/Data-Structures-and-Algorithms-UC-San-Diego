import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
	if(a%b==0) return b;
	if(b%a==0) return a;
    while(a!=b) {
    	if(a > b) a = a - b; else b = b - a;
    }
    if(a > b) return b; else return a;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}
