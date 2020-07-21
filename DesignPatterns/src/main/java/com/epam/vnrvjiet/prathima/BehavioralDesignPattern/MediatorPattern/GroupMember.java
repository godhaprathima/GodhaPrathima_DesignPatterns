package com.epam.vnrvjiet.prathima.BehavioralDesignPattern.MediatorPattern;

public class GroupMember {
	private String name;

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public GroupMember(String name){
	      this.name  = name;
	   }

	   public void sendMessage(String message){
	      GroupChat.showMessage(this,message);
	   }

}
