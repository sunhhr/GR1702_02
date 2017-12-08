package com.sjq;

public class Examinee {
	private String name;
	private String ID;
	private double Chinese;
	private double math;
	private double English;
	private double total;
	
	
	public Examinee() {
		
	}

	public Examinee(String name, String iD, double chinese, double math,
			double english, double total) {
		this.name = name;
		ID = iD;
		Chinese = chinese;
		this.math = math;
		English = english;
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public double getChinese() {
		return Chinese;
	}

	public void setChinese(double chinese) {
		Chinese = chinese;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEnglish() {
		return English;
	}

	public void setEnglish(double english) {
		English = english;
	}

	public double getTotal() {
		return getChinese()+getMath()+getEnglish();
	}

	@Override
	public String toString() {
		return "Examinee [name=" + name + ", ID=" + ID + ", Chinese=" + Chinese
				+ ", math=" + math + ", English=" + English + ", total="
				+ total + "]";
	}
	
	
	

}
