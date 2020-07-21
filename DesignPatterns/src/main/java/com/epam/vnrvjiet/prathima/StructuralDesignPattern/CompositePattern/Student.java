package com.epam.vnrvjiet.prathima.StructuralDesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String student;
	private String department;
	private String rollNo;
	private List<Student> studentdetails;
	
	public Student(String student,String department,String rollNo)
	{
		this.student=student;
		this.department=department;
		this.rollNo=rollNo;
		studentdetails=new ArrayList<Student>();
		
	}
	public void add(Student s)
	{
		studentdetails.add(s);
	}
	public void remove(Student s)
	{
		studentdetails.remove(s);
	}
	public List<Student>getStudentDetails()
	{
		return studentdetails;
	}
	public String toString()
	{
		return ("StudentName:"+student+" department:"+department+" rollno:"+rollNo);
	}
	
}
