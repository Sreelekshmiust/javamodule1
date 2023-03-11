package listdemo;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		//colors.add(new Object());
		//colors.add(new Double("10.10"));
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Black");
		colors.add("Red");
		colors.add("White");
		colors.add(null);
		colors.add(null);
		
		//String str = colors.get(3);
		System.out.println(colors);
		System.out.println(colors.size());
	}

}
