package Project;
 
class M1 implements M2{
int account;
	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("wnjavnnv");
	}

	@Override
	public void m1() {
		System.out.println("welcome");
		
	}

	@Override
	public void balenace() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean withdraw() {
		// TODO Auto-generated method stub
		return true;
		
	}

	@Override
	public void ministatment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkBalenace() {
		// TODO Auto-generated method stub
		this.account=account;
		if(true) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public boolean deposite() {
		// TODO Auto-generated method stub
		return true;
		
	}
	
}

public class MAin  {
	public static void main(String[] args) {
		M1 m=new M1();
		m.m();
		m.m1();
		System.out.println(M2.j);
		m.balenace();
		m.checkBalenace();
		m.deposite();
		
	}

}
