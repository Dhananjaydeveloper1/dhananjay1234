package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class restdemo {
	
	// creating object of personservices
	personservice personservice=new personservice();

	
@GetMapping("/myurl")
public String saytitle() {
	System.out.println("hello");
	return "hello world";
}


@GetMapping("/personinfo")
public person getDummyperson() {
person p =new person();//creating java object
p.setName("dk");
p.setEmail("Ram@gmail.com");
p.setAddress("delhi");
p.setId(123);
return p;
}

// add the person information POst

@PostMapping(value = "/insertpersondetails")
public person insertDummyperson(@RequestBody person person) {

return personservice.addPerson(person); //calling the service
}

//update person info
@PutMapping("/update")


public person updatepersonInfo(@RequestBody person person) {
return personservice.updatePerson(person);

}

//get list
@GetMapping("/getlist")
public  List<person> getDummypersonList()
{
List<person> listofperson=personservice.getAllPersonlist();
return listofperson;
}
}
