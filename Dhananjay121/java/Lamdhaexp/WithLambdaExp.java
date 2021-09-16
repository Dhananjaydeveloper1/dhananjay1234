package Lamdhaexp;
interface Darweable{
	public void draw();
	
}
public class WithLambdaExp {

	public static void main(String[] args) {
		int width=15;
		//withlamdda
		Darweable d=()->{
			System.out.println("Drawing " + width);
		
	};
d.draw();
}
}