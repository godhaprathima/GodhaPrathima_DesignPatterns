package com.epam.vnrvjiet.prathima.StructuralDesignPattern.CompositePattern;

 
 
public class CompositePattern {
	public static void main(String[] args) {
		Student eceStudent1=new Student("Ram","ECE","17071A0542");
		Student cseStudent1=new Student("Laxman","CSE","17071A04C2");
		Student cseStudent2=new Student("Varun","CSE","17071A04D5");
		Student eceStudent2=new Student("Vani","ECE","17071A05D7");
		Student itStudent1=new Student("Swathi","IT","17071A0542");
		Student itStudent2=new Student("Radhika","IT","17071A04L2");
		
		eceStudent1.add(eceStudent2);
		eceStudent1.add(cseStudent1);
		
		cseStudent1.add(cseStudent2);
		cseStudent1.add(itStudent1);
		
		itStudent1.add(itStudent2);
		
		System.out.println(eceStudent1+"\n His Composites are \n");
		
		
		for(Student eceStudentComposites:eceStudent1.getStudentDetails())
			
		{
			System.out.println(eceStudentComposites);
			
			
		}
		System.out.println("\n"+cseStudent1+"\n His Composites are \n");
		for(Student cseStudentComposites:cseStudent1.getStudentDetails()) {
			System.out.println(cseStudentComposites);
		}
		
		
		
		
	}
	
	

}
