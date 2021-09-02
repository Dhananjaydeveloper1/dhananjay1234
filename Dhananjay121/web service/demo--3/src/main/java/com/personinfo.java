package com;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class personinfo {
	
	public person getDummyperson() {
		person p =new person();
		p.setId(123);//creating java object
		p.setName("dk");
		p.setEmail("Ram@gmail.com");
		p.setAddress("delhi");
		return p;
	}
}


