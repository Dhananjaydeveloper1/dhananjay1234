package com.example.demo.service;
import java.util.ArrayList;

import com.example.demo.model.Authorities;

public interface AuthoritiesService {

	//Add authorities
	Authorities addAuthorities(Authorities authorities);
	
	//List of authorities
	ArrayList<Authorities> getListOfAuthories();
	
	//Update Authorities
	Authorities updateAuthorities(Authorities authorities);
	
	//Delete Authorities by id
	void deleteAuthoritiesById(Integer id);
	
}