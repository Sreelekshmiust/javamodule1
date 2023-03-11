package oopsday2.shape;

public class Square implements ShapesI {
	
	private double side;
	private double area;
	
	public Square() {
		
	}

	public Square(double size) {
		super();
		this.side = size;
	}

	

	public double getSize() {
		return side;
	}

	public void setSize(double size) {
		this.side = size;
	}

	@Override
	public void area() {
		 area = side*side;
		System.out.println("Area = " + area);
		
	}

	

}
