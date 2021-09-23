package com.student;

import java.util.ArrayList;
import java.util.List;

import com.students.StudentService;

public class ManageStudent {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();

		Integer studnetID1 = studentService.addStudent("Dhananjay", 22, "cse", 20000);

		Integer studentID2 = studentService.addStudent("Rahul", 23, "cse", 50000);

		List<Integer> listinfo = new ArrayList<Integer>(); // collection

		listinfo.add(studnetID1);
		listinfo.add(studentID2);

		if (listinfo.size() != 0) {

		} else {
			System.out.println("all list");
		}
//list
		try {
			studentService.ListAllStudent();
		} catch (Exception e) {

			e.printStackTrace();
		}
		try {
			//	studentService.updateStudentDetails(5, 55);
				} catch (Exception e) {

					e.printStackTrace();
				}
				
				
				try {
		//		  studentService.deleteStudentDetailsById(4, 55);
				} catch (Exception e) {

					e.printStackTrace();
	}
}}