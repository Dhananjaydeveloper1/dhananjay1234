package sum;
import java.util.Scanner;
public class Area {
int lenght,breadth;
public Area(int l,int b)
{
	lenght=l;
	breadth=b;
}
public int getArea()
{
	return lenght*breadth;
}
public static void main(String args[])
{
	int l,b;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter lenght");
	l=s.nextInt();
	System.out.println("Enter breadth");
	b=s.nextInt();
	Area a=new Area(l,b);
	System.out.println("Area is:"+a.getArea());
	
}
}
