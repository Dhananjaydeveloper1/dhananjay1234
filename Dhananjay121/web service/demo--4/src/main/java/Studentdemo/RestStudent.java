package Studentdemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class RestStudent {
	
	StudentService studentservice=new StudentService();
	
	@GetMapping("/myurl")
	public String saytitle() {
		System.out.println("my name is dhananjay");
		return "dhanajay";
	}

@GetMapping("/Studentinfo")
public Student getDummystudent() {
	Student s  =new Student();
	s.setName("dk");
	s.setEmail("Ram@gmail.com");
	s.setAddress("delhi");
	s.setId(123);
	s.setMobNo(475647564);
	s.setSchoolName("fgf.school");
	s.setSection("a");
	return s;
	}


@PostMapping(value = "/insertstudentdetails")
public Student insertDummystudent(@RequestBody Student student ) {

return studentservice.addstudent(student); //calling the service
}
@PutMapping("/update")


public Student updatestudentInfo(@RequestBody Student student) {
return studentservice.updatestudent(student);

}

//get list
@GetMapping("/getlist")
public  List<Student> getDummystudentList()
{
List<Student> listofstudent=studentservice.getAllStudentlist();
return listofstudent;
}
}
