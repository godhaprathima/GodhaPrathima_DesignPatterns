package com.epam.vnrvjiet.prathima.BehavioralDesignPattern.IteratorPattern;

public class NamesRepository implements Container {
	public String names[] = {"Parrot" , "Peacock" ,"Butterfly" , "Sparrow","Crow","Pigeon"};

	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

	      int index;

	      public boolean hasNext() {
	      
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }		
	   }
	

}
