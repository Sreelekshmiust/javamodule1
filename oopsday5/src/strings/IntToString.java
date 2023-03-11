package strings;

public class IntToString {

	public static void main(String[] args) {
		
		int i =121;
		String str = i+"";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		boolean result = str.equals(sb.toString());
		System.out.println(result);

		
		int n=10;
		
				
		//from Integer to String
		String s2 = Integer.toString(n);
		//integer =s2.intValue(i);
		
	
	
	
	}

}
