package strings;

public class TestStrings {

	public static void main(String[] args) {
		
		byte bytes[]= {65,66,67,68,69};
		
		String str = new String(bytes);
		//String str =new String();
		System.out.println(str.length());
		System.out.println(str);
		str ="Welcome to UST Global";
		bytes = str.getBytes();
		for(byte b:bytes) {
			System.out.println(b);
		}
		
		char chars[]= {'U','S','T',' ', 'G'};
		
		str = new String(chars);
		System.out.println(str);
		
		str.getChars(0, chars.length-1, chars, 0);
		for(char c:chars) {
			System.out.println(c);
		}
		
		
		int count=0;
		
		str=new String("She sells sea shells in sea shore");
		for(int i=0;i<str.length();i++) {
			char d= str.charAt(i);
			if(d=='S' | d=='s')
				count++;
		}
		System.out.println("count of s = " + count);
	
		String words[] = str.split(" ");
		System.out.println(words.length);
		
		for(String word: words) {
			System.out.println(word);
			
			String words1[] = str.split("[.] ");
			System.out.println(words.length);
			
			for(String word1: words1) {
				System.out.println(word1);
			}
			}
		
		str = new String("Cartoon");
		System.out.println(str.startsWith("Car"));
		System.out.println(str.endsWith("toon"));
		
		
		int apos = str.indexOf('a');
		int tpos = str.indexOf('t');
		
		String str2 =str.substring(apos, tpos+1);
		System.out.println(str2);
		
		str2=str.substring(tpos);
		System.out.println(str2);
		
		String string =new String ("madamdam");
		int dpos = string.lastIndexOf('d');
		str2 =string.substring(dpos,string.length());
		System.out.println(str2);
		
		String email = new String("sreelekshmi.kumar@ust.com");
		int dotpos=email.lastIndexOf('.');
		String email1 = email.substring(dotpos,email.length());
		System.out.println(email1);
		
		
		String str3 = new String("WELCOME");
		String str4 = new String("welcome");
		String str5 = new String("welcome");
		
		boolean result = str3.equals(str4);
		System.out.println(result);
		result = str4.equals(str5);
		System.out.println(result);
		result = str3.equalsIgnoreCase(str4);
		System.out.println(result);
		
		int val = str3.compareTo(str4);
		System.out.println(val);
		
		val = str4.compareTo(str3);
		System.out.println(val);
		
		val = str4.compareTo(str5);
		System.out.println(val);
	
		System.out.println(str3.toLowerCase());
		System.out.println(str3);
		
		String string1 = new String("16-11-477/6/A/3 Hyderabad 500036");
		int digi=0;
		int chara =0;
		int speci =0;
		int space=0;
		int upper=0;
		int lower=0;
		for(int i=0;i<string1.length();i++) {
			char c= string1.charAt(i);
			if(Character.isDigit(c)) {
				digi++;
			}
				else if(Character.isLetter(c)) {
					chara++;
			}
				else if(Character.isWhitespace(c)) {
					space++;
				}
				else
					speci++;
		if(Character.isUpperCase(c))
			upper++;
		else if(Character.isLowerCase(c))
			lower++;
		}
		
		System.out.println("the count of digits = " + digi);
		System.out.println("the count of letters = " +chara);
		System.out.println("the count of whitespace = " + space);
		System.out.println("the count of special character = " +speci );
		System.out.println("the count of uppercase letter = "+ upper);
		System.out.println("the count of lowercase letter = "+lower);
		
		
	}

}
