package listdemo;

import java.util.TreeSet;
import java.util.Iterator;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> bookset = new TreeSet<>();
		bookset.add("Java in nutshell");
		bookset.add("Java complete reference");
		bookset.add("Thinking in java");
		bookset.add("Java in 21 days");
		bookset.add("Java for dummy");
		
		System.out.println(bookset);
		System.out.println(bookset.size());
		System.out.println(bookset.contains("java in nutshell"));
		
		bookset.add("Thinking in java");
		//bookset.add(null);                 TreeSet does not allow null element
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
