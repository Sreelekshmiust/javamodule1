package oopsday4.polymorphism;

public class Circle extends Shape {
	
private double radius;
	
	public Circle() {
		
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setSide(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return 2*3.14*radius*radius;
	}
	
	

}
