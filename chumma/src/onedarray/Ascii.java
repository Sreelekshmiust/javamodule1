package onedarray;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is sreelekshmi h kumar";
		String str="";
		char ch;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				ch=(char) (s.charAt(i)-32);
			}
			else if(s.charAt(i)==' ') {
				
				i++;
				str +=' ';
					ch=(char) (s.charAt(i)-32);
				
			}
			else
				ch=(char) (s.charAt(i));
			str +=ch;
		}
		System.out.println(str);
		
	}

}
