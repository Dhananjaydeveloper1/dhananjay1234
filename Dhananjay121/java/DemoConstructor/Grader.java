package DemoConstructor;

public class Grader {
private int scroe;
int  percent,
 String=scroe;
 Grader(String name,int bio,int eng,int math,int science)
 {
	 int sum;
	 sum=bio+eng+math+science;
	 percent=(sum*100/400);
	 System.out.println("name :"+name+ "\npercent"+percent);
 }
 void letteerGrade() {
	 if(percent>0 && percent<100) {
		 if(percent>80) {
			 String scroe = " Grade A";
			 System.out.println(scroe);
		 }
			 else if (percent>70 && percent< 80) {
				 
				 String scroe="Grade B";
				 System.out.println(scroe);
			 }
			 else if(percent >60 && percent <70) {
				 String scroe="Grade C";
				 System.out.println(scroe);
			 }
			 else if(percent >50 && percent <60){
				 String scroe="Grade D";
				 System.out.println(scroe);
			 }
		 System.out.println();
		 }
			
	 
	 }

	
}

