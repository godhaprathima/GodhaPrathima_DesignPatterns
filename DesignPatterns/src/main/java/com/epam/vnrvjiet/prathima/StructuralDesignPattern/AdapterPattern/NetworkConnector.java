package com.epam.vnrvjiet.prathima.StructuralDesignPattern.AdapterPattern;

public class NetworkConnector implements Network{
	NeworkAdapter networkAdapter;
	public void connect(String networkType) {
		if(networkType.equalsIgnoreCase("3G"))
		{
			System.out.println("connected to 3G Network");
		}
		else if(networkType.equalsIgnoreCase("4G")||networkType.equalsIgnoreCase("5G"))
		{
			networkAdapter=new NeworkAdapter(networkType);
			networkAdapter.connect(networkType);
		}
		else{
	         System.out.println("Invalid Network Type  format not supported");
	      }
	}

}
