import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        int num10 = 0;
    	num10 = m/10;
    	m = m - 10*num10;
    	int num5 = 0;
    	num5 = m/5;
    	m = m - 5*num5;
    	
        //write your code here
        return num10+num5+m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

