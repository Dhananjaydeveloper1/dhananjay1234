package Interface;

class add{
	void Add(int num1,int num2) {
		System.out.println("sum of two no="+( num1+num2));
	}
	void Sub(int num1,int num2,int num3) {
		System.out.println("sub of two three no="+(num1-num2-num3));
	}
}
public class MethodOverloading {
	public static void main(String args[]) {
		add a1=new add();
		a1.Add(12,13);
		a1.Sub(14,12,10);
	}
	}