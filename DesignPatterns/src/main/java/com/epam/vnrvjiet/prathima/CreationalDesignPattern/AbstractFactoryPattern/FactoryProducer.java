package com.epam.vnrvjiet.prathima.CreationalDesignPattern.AbstractFactoryPattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(boolean colour){   
	      if(colour){
	         return new GreenColourFactory();         
	      }else{
	         return new ColourFactory();
	      }
	   }

}
