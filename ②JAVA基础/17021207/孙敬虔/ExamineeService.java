package com.sjq;

import java.util.ArrayList;
import java.util.Scanner;


public class ExamineeService implements IExaminee {
	public void helpinfo() {
		System.out.println("******高考信息管理系统******");
		System.out.println("【1】请输入一个学生信息");
		System.out.println("【2】显示所有考生信息");
		System.out.println("【3】最高分查询");
		System.out.println("【4】退出");
	}
	    void helpmax(){
		System.out.println("******小菜单******");
		System.out.println("语文最高分请输入 1");
		System.out.println("数学最高分请输入2");
		System.out.println("英语最高分请输入3");
		System.out.println("查找总分请输入4");
		System.out.println("退出请输入5");
	}
	

	@Override
	public void addExaminee(ArrayList<Examinee> arrayList,Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		Examinee examinee = new Examinee(a[0], a[1], Double.parseDouble(a[2]), Double.parseDouble(a[3]),
				Double.parseDouble(a[4]), Double.parseDouble(a[5]));
		arrayList.add(examinee);
		System.out.println(examinee.toString());
	}

	@Override
	public void infoExaminee(ArrayList<Examinee> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Examinee examinee = arrayList.get(i);
			System.out.println(examinee.toString());
		}

	}
	@Override
	public void getMax(ArrayList<Examinee> arrayList, String subject) {
		double Max = 0;
		if (subject.equals("总分")) {
			Max = arrayList.get(0).getTotal();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotal()>Max) {
					Max = arrayList.get(i).getTotal();
					
					
				}
				
			}
			
		}
		
		
		
		if (subject.equals("语文")) {
			Max = arrayList.get(0).getChinese();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChinese()>Max) {
					Max = arrayList.get(i).getChinese();
					
					
				}
				
			}
			
		}
		
		if (subject.equals("数学")) {
			Max = arrayList.get(0).getMath();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMath()>Max) {
					Max = arrayList.get(i).getMath();
					
					
				}
				
			}
			
		}
		
		
		if (subject.equals("英语")) {
			Max = arrayList.get(0).getEnglish();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglish()>Max) {
					Max = arrayList.get(i).getEnglish();
					
					
				}
				
			}
			
		}
		System.out.println(Max);
		
		
		
		
		
		
		
		
		
	}


}
