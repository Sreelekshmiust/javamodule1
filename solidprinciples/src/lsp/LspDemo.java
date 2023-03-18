package lsp;

public class LspDemo {
	
	public void CalculateArea(Shape s) {
		System.out.println(s.getArea());
	}

	public static void main(String[] args) {
	     LspDemo lsp = new LspDemo();
	     lsp.CalculateArea(new Rectangle(1,4));
	     lsp.CalculateArea(new Square(4));
	}

}
