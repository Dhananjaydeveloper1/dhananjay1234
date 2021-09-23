package com.students;



import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.student.*;
import com.student.Student;
import com.student.util.*;

public class StudentService {
	
	static SessionFactory sessionFactoryobj;
	static Session sessionobj;

	//// POST///
	public Integer addStudent(String name, int age, String dept_name, int salary) { // create student

		Transaction tx = null;
		Integer Studentid = null;
		try {
			sessionobj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionobj.beginTransaction();
			Student student = new Student(name, age, dept_name, salary); // object student
			Studentid = (Integer) sessionobj.save(student); // save the
			tx.commit(); // explictiy
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionobj.close();
		}
		return Studentid;
	}

// GET request//
//list//

	public void ListAllStudent() {
		System.out.println("---------------this is listAllStudent-----------");
		Transaction tx = null;
		try {
			sessionobj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionobj.beginTransaction();
			List ListAllStudent = sessionobj.createQuery("From Student").list();
			Iterator iterator = ListAllStudent.iterator();
			while (iterator.hasNext()) {

				Student student1 = new Student();
				System.out.println("Enter the name" + student1.getName());
				System.out.println("Enter the age:" + student1.getAge());
				System.out.println("Enter the dept_name:" + student1.getdept_name());
				System.out.println("Enter the salary:" + student1.getSalary());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionobj.close();
		}
	}

	// update

	public void updateStudentDetails(Integer StudentId, int salary) {
		System.out.println(" from inside  updateEmployeeDetails()  ");
		Transaction tx = null;
		try {

			sessionobj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionobj.beginTransaction();
// update logic

			Student student = (Student) sessionobj.get(Student.class, StudentId);

			student.setSalary(salary);

			sessionobj.update(student);// hibernate will form update query automatically

			System.out.println("update sucessfully...");

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionobj.close();
		}

	}
	// delete

	public void deleteStudentDetailsById(Integer StudentId, int salary) {
		System.out.println(" from inside  deleteEmployeeDetailsBy() ");
		Transaction tx = null;
		try {

			sessionobj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionobj.beginTransaction();
//update logic

			Student student = (Student) sessionobj.get(Student.class, StudentId);

			student.setSalary(salary);

			sessionobj.delete(student);// hibernate will form delete query automatically

			System.out.println("deleted sucessfully..." + student.getId());

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionobj.close();
		}

	}

	
		
	}

	
	


