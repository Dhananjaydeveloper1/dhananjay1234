package Lamdhaexp;
interface Circle{
	public void circle();
	
}
public class Lambda {
public static void main(String args[]) {
	//without lamdha
	int radius =12;
	Circle c=new Circle() {

		@Override
		public void circle() {
			System.out.println("circle "+ radius);
		}
		
	};
	c.circle();
	
	
}
}
