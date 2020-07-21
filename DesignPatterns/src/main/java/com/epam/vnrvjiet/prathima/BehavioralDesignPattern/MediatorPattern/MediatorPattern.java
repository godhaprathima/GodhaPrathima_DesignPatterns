package com.epam.vnrvjiet.prathima.BehavioralDesignPattern.MediatorPattern;

public class MediatorPattern {
	public static void main(String[] args) {
	      GroupMember Raj = new GroupMember("Robert");
	      GroupMember Kumar = new GroupMember("John");

	      Raj.sendMessage("Hi! Raj! ");
	      Kumar.sendMessage("Hello! Kumar! Good to hear from you");
	   }

}
