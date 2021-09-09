package Interface;
abstract class baseA{
	abstract void display(); 
	void show() {
		
	}

}
 class B extends baseA{
	 void display() {
		 System.out.println("call me from B");
	 }
	
}
public class AbstractDemo {
public static void main(String arrgd[]) {
	 B b1=new  B();
	b1.display();
	
 }
}
