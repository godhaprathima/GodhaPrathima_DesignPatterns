package com.epam.vnrvjiet.prathima.CreationalDesignPattern.AbstractFactoryPattern;

public class ColourFactory extends AbstractFactory {
	public Colour getFruit(String FruitType){    
	      if(FruitType.equalsIgnoreCase("APPLE")){
	         return new Apple();         
	      }else if(FruitType.equalsIgnoreCase("MANGO")){
	         return new Mango();
	      }	 
	      return null;
	   }

}
