package DemoConstructor;
 class Shape {
	void draw() {
		System.out.println(" shape draw()");
	}

	void erease() {
		System.out.println(" erease draw()");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("circle draw");
	}

	void erease() {
		System.out.println("circle erease");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("triangle draw");
	}

	void erease() {
		System.out.println("triangle erease");

	}
	}
class Square extends Shape{
	void draw(){
		System.out.println("square draw");
		
	}
	void erease() {
		System.out.println("square erease");
	}

	
}
public class ShapeMain{
	
	public static void main(String args[]) {
		Square square = new Square();
		square.draw();
		square.erease();
		Triangle triangle = new Triangle();
		triangle.draw();
		triangle.erease();
		Circle circle = new Circle();
		circle.draw();
		circle.erease();
		

	}
}
