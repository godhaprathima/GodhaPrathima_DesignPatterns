package com.epam.vnrvjiet.prathima.StructuralDesignPattern.AdapterPattern;

public class AdapterPattern {
	public static void main(String[] args) {
	NetworkConnector networkConnector=new NetworkConnector();
	networkConnector.connect("3G");
	networkConnector.connect("4G");
	networkConnector.connect("5g");
	networkConnector.connect("6g");
	
	}

}
