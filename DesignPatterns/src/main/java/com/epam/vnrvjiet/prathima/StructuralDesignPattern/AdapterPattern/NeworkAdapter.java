package com.epam.vnrvjiet.prathima.StructuralDesignPattern.AdapterPattern;

public class NeworkAdapter implements Network{
	HighSpeedNetwork advancedNetwork;
	public NeworkAdapter(String networkType) {
		if(networkType.equalsIgnoreCase("4G") ){
			advancedNetwork = new Network4G();			
	         
	      }
		else if (networkType.equalsIgnoreCase("5G") ){
			advancedNetwork = new Network5G();			
	         
	      }
		
	}
	public void connect(String networkType) {
		if(networkType.equalsIgnoreCase("4G") ){
			advancedNetwork.NetworkType4G(networkType);			
	         
	      }
		else if (networkType.equalsIgnoreCase("5G") ){
			advancedNetwork.NetworkType5G(networkType);			
	         
	      }
	}
	
	

}
