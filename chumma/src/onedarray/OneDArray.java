package onedarray;

public class OneDArray {
	
	public void test(int n,int[] game,int leap) {
		int pointer=0;
		boolean flag;
		outerloop:
			for(int i=0;i<n;i++) {
			if(game[i+1]==0) {
				pointer=pointer+1;
				if(pointer == n || pointer>n) {
					flag= true;
					break;
				}
			}
			else if(game[i+leap]==0) {
				pointer=pointer+leap;
				if(pointer == n || pointer>n) {
					flag= true;
					break;
				}
			}
			else {
				int pointer1=pointer;
				for(int j=pointer;j>0;j--) {
					if(game[j+leap]==0) {
						pointer1=j;
					}
				}
				if((pointer1+leap)>pointer)
					pointer=pointer1;
				else {
					pointer=pointer;
					//return outerloop;
				}
					
			}
			
		}
	}

	public static void main(String[] args) {
		
		int n;
		int q;
		int leap;
		int[] game;
		game=new int[100];

	}

}
