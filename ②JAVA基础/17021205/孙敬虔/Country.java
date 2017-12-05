package com.hashnap.zk;

public class Country {
	
	String name;
	long population;
	
	
	public Country(String name, long population) {
		
		this.name = name;
		this.population = population;
	}


	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}
	
	

}
