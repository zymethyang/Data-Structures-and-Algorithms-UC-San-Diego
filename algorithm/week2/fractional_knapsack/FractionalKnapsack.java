import java.util.Scanner;

public class FractionalKnapsack {
	
	private static void sort(double[][] data,int n) {
		double temp[] = new double[3];  
        for(int i=0; i < n; i++){  
        	for(int j=1; j < (n-i); j++){  
        		if(data[j-1][2] > data[j][2]){  
        			//swap elements  
        			temp = data[j-1];  
        			data[j-1] = data[j];  
        			data[j] = temp;
                }        
            }  
        }  
	}
	
    private static double getOptimalValue(int capacity, double[][] data, int n) {
    	sort(data,n);
    	double value = 0;
    	for(int i=(n-1);i>=0;i--) {	
    		if(capacity <= data[i][1]) {
    			if(capacity > 0 ) value += data[i][2]*capacity;
    			capacity = 0;
    		}
    		else { 
    			capacity = (int) (capacity - (int)data[i][1]);
    			if(capacity > 0 ) value += data[i][2]*data[i][1];
    		}
    	}
    	return value;
    }
    
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        double[][] data = new double[n][3];
        
        for (int i = 0; i < n; i++) {
            data[i][0] = scanner.nextDouble();
            data[i][1] = scanner.nextDouble();
            data[i][2] = data[i][0]/data[i][1];
        }
        System.out.println(getOptimalValue(capacity, data, n));
    }
} 
