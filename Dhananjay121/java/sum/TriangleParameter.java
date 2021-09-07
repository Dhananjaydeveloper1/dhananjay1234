package sum;

public class TriangleParameter
{
	int s1,s2,s3;
	public TriangleParameter(int side1,int side2,int side3) {
	s1=side1;
	s2=side2;
	s3=side3;
}
public static void main(String args[]) {
	TriangleParameter tp1=new TriangleParameter(3,4,5);
	int peri = (tp1.s1 + tp1.s2 + tp1.s3);
	System.out.println("perimeter is" + peri);
	int sp = (peri / 2);
	int ar = (((sp * (sp - tp1.s1)) * (sp - tp1.s2)) * (sp - tp1.s3));
	int area = (int) Math.sqrt(ar);
	System.out.println("Area is" + area);

}

}