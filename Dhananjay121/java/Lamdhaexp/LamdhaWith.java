package Lamdhaexp;
interface Circles{
	public void circle();
}
public class LamdhaWith {
public static void main(String args[]) {
	int radius=12;
	Circle c=()->{
		System.out.println("circle " + radius);
	};
	c.circle();
}
}
