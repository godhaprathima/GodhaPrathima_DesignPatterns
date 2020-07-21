package com.epam.vnrvjiet.prathima.CreationalDesignPatterns.SingletonPattern;

public class SingleInstance {

		   
		   private static SingleInstance instance = new SingleInstance();

		   
		   private SingleInstance(){}

		   
		   public static SingleInstance getInstance(){
		      return instance;
		   }

		   public void GetInfo(){
		      System.out.println("EPAM PEP COURSE");
		   }

}
