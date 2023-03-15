package paramtest;

public class Primenumber {
	
	public boolean validate(int n) {
		int flag=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
				/*
				 * flag++; break;
				 */
		}
				
		}
		/*
		 * if(flag==0) return true; else return false;
		 */
		return true;
	}

}
