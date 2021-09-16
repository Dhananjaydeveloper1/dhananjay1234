package Lamdhaexp;

interface Drawable {
	public void draw();
}

public class WithoutLambdaExpDemo {
	public static void main(String args[]) {
		int width=15;
		 // without lambda
		Drawable d=new Drawable() {
			
				 public void draw() {
		                System.out.println("Drawing " + width);
			}
		};
		  d.draw();
}}
