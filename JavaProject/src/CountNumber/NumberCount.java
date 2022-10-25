package CountNumber;

public class NumberCount {
	public static void main(String[] args) {
		int num=1234567;
		int count=0;
		int n=0;
		while(num>0) {
			num=num/10;
			
			
			count++;
		}
		System.out.println(" number of count "+count);
		
		
	}

}
