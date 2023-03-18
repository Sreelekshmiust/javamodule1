package lsp;

public class Rectangle implements Shape {
	
	private int length;
	private int breadth;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}



	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return this.length*this.breadth;
	}



}
