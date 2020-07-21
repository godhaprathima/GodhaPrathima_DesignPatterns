package com.epam.vnrvjiet.prathima.CreationalDesignPattern.AbstractFactoryPattern;

public class GreenColourFactory extends AbstractFactory {
	public Colour getFruit(String FruitType){    
	      if(FruitType.equalsIgnoreCase("APPLE")){
	         return new GreenApple();         
	      }else if(FruitType.equalsIgnoreCase("MANGO")){
	         return new GreenMango();
	      }	 
	      return null;
	   }

}
