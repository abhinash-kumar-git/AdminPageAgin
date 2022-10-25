package fabbancciseria;

public class Fanacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3 = 0,count=10;
		System.out.println(n1+"     "+n2);
		for(int i=2;i<count;++i) {
			if(i%2==1) {
				
			
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
			else {
				System.out.println("wd,asc,da");
			}
		}

	}

}
