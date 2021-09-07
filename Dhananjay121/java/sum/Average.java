package sum;
import java .io.IOException;
import java.io.DataInputStream;
public class Average {
	int avg;
	void Average(int num1,int num2,int num3) {
		avg=(num1+num2+num3)/3;
	}
int printAverage() {
	return avg;
}
public class Average{
	public static void main(String[] args)throws IOException {
		DataInputStream input=new DataInputStream(System.in);
		int num1,num2,num3;
		System.out.println("Enter the first number");
		num1=Integer.parseInt(input.readLine());
		System.out.println("Enter the first number");
		num2=Integer.parseInt(input.readLine());
		System.out.println("Enter the first number");
		num3=Integer.parseInt(input.readLine());
		
		Average Avg1=new Average();
		Average Avg1= Avg(num1,num2,num3/3);
		int temp=Avg1.printAverage();
	}}}
		
	


