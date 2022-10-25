package fabbancciseria.pladrome;

public class plaidromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;
		int n=4546;
		
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)*r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("palidrome is number");
		}
		else {
			System.out.println(" not palidrome number");
		}

	}

}
