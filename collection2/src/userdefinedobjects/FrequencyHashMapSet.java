package userdefinedobjects;

import java.util.HashMap;

public class FrequencyHashMapSet {

	public static void main(String[] args) {

		
		String str = "Hello world . Hello java , java is simple , powerful , robust , unique independent .";
		String str1[] = str.split(" "); 
		int len = str1.length; 
		System.out.println(len);
		
		HashMap<String,Integer> test = new HashMap<>();
		
		for(String word : str1) {
			Integer  count = test.get(word);
			if(count != null) {
				test.put(word, count+1);
			}
			else
				test.put(word, 1);
				
		}
		System.out.println(test);
	}
}	


