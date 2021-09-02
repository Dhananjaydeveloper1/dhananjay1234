package Studentdemo;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


public class StudentService {
	
	
	static HashMap<Integer,Student> studetIdMap = getStudentIdMap(); //map list
	
	public StudentService()
	{
		super();
		
		
		if(studetIdMap == null) {
			studetIdMap = new HashMap<Integer, Student>();
			Student indiaStudent =new Student(1, "rk", "gns", "A","delhi","dhdk@gmail.com",746745436);
			Student delhiStudent =new Student(2, "rk", "rns", "B", "hss","dhdk@gmail.com",746745436);
			Student biharStudent =new Student(3, "dk", "tns", "C", "punjab","sjdj@gmail.com",746745436);
			Student barbighaStudent =new Student(4, "pk", "vns", "D", "bengalor","slkkf@gmail.com",746745436);
			Student gurugramStudent =new Student(5, "sk", "dns", "E", "patna","dhdk@gmail.com",746745436);
			Student newdelhiStudent =new Student(6, "rk", "ans", "F", "barbogha","dhdk@gmail.com",746745436);
			
			studetIdMap.put(1, indiaStudent);
			studetIdMap.put(2, delhiStudent);
			studetIdMap.put(3, biharStudent);
			studetIdMap.put(4, barbighaStudent);
			studetIdMap.put(5, gurugramStudent);
			studetIdMap.put(6, newdelhiStudent);	
		}
	}
	public List<Student> getAllStudentlist() {
		List<Student> studentlist = new ArrayList<Student>(studetIdMap.values());
		return studentlist;
		}

		 public Student getstudent(int id) {
		Student student = studetIdMap.get(id);
		return student;
		}
		// add student
		public Student addstudent(Student student ) {
		student.setId(getMaxId()+ 1);
		// key , value
		studetIdMap.put(student.getId(), student); ///logic class
		return student;
		}
		//update
		public Student updatestudent(Student student) {
		if (student.getId() <= 0)
		return null;
		studetIdMap.put(student.getId(), student);
		return student;

		 }
		//delete

		 public void deleteStudent(int id) {
		studetIdMap.remove(id);
		}

		 public static HashMap<Integer, Student> getStudentIdMap() {
		return studetIdMap;
		}

		 // Utility method to get max id
		public static int getMaxId() {
		int max = 0;
		for (int id : studetIdMap.keySet()) 
		{
			
		if (max <= id)
		max = id;

		 }
		return max;
		}
		}
