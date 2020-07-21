package com.epam.vnrvjiet.prathima.BehavioralDesignPattern.IteratorPattern;

public class IteratorPattern {
	public static void main(String[] args) {
	      NamesRepository names = new NamesRepository();

	      for(Iterator iter = names.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }

}
