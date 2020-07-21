package com.epam.vnrvjiet.prathima.CreationalDesignPattern.AbstractFactoryPattern;

public class FactoryPattern {
	public static void main(String[] args) {
	      AbstractFactory colourFactory = FactoryProducer.getFactory(false);
	      
	      Colour fruit1 = colourFactory.getFruit("MANGO");
	     
	      fruit1.GetName();
	      
	      Colour fruit2 = colourFactory.getFruit("APPLE");
	     
	      fruit2.GetName();
	      
	      AbstractFactory colourFactory1 = FactoryProducer.getFactory(true);
	     
	      Colour fruit3 =colourFactory1.getFruit("Mango");
	     
	      fruit3.GetName();
	      
	      Colour fruit4 =colourFactory1.getFruit("Apple");
	      
	      fruit4.GetName();
	      
	   }

}
