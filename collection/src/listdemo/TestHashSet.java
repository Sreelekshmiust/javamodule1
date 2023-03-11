package listdemo;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		
		HashSet<String> bookset = new HashSet<>();
		bookset.add("java in nutshell");
		bookset.add("java complete reference");
		bookset.add("Thinking in java");
		bookset.add("java in 21 days");
		bookset.add("java for dummy");
		
		System.out.println(bookset);
		System.out.println(bookset.size());
		System.out.println(bookset.contains("java in nutshell"));
		
		bookset.add("Thinking in java");
		bookset.add(null);
		bookset.add(null);
		System.out.println(bookset);
		System.out.println(bookset.size());
		
		for(String book : bookset) {
			System.out.println(book);
		}
		
		Iterator<String> iter = bookset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
