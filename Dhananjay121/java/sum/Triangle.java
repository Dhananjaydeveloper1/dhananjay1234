package sum;

public class Triangle {
	int a1 = 3;
	int a2 = 4;
	int a3 = 5;

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		int peri = (t1.a1 + t1.a2 + t1.a3);
		System.out.println("perimeter is" + peri);
		int sp = (peri / 2);
		int ar = (((sp * (sp - t1.a1)) * (sp - t1.a2)) * (sp - t1.a3));
		int area = (int) Math.sqrt(ar);
		System.out.println("Area is" + area);

	}

}
