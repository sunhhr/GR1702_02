package com.sjq;

import java.util.ArrayList;
import java.util.Scanner;


public interface IExaminee {
	void addExaminee(ArrayList<Examinee> arrayList,Scanner sc);
	
	void infoExaminee(ArrayList<Examinee> arrayList);
	
	void getMax(ArrayList<Examinee> arrayList,String subject);
	
	

}
