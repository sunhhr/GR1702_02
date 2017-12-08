package com.sjq;

import java.util.ArrayList;
import java.util.Scanner;


public class ExamineeService implements IExaminee {
	public void helpinfo() {
		System.out.println("******�߿���Ϣ����ϵͳ******");
		System.out.println("��1��������һ��ѧ����Ϣ");
		System.out.println("��2����ʾ���п�����Ϣ");
		System.out.println("��3����߷ֲ�ѯ");
		System.out.println("��4���˳�");
	}
	    void helpmax(){
		System.out.println("******С�˵�******");
		System.out.println("������߷������� 1");
		System.out.println("��ѧ��߷�������2");
		System.out.println("Ӣ����߷�������3");
		System.out.println("�����ܷ�������4");
		System.out.println("�˳�������5");
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
		if (subject.equals("�ܷ�")) {
			Max = arrayList.get(0).getTotal();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotal()>Max) {
					Max = arrayList.get(i).getTotal();
					
					
				}
				
			}
			
		}
		
		
		
		if (subject.equals("����")) {
			Max = arrayList.get(0).getChinese();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChinese()>Max) {
					Max = arrayList.get(i).getChinese();
					
					
				}
				
			}
			
		}
		
		if (subject.equals("��ѧ")) {
			Max = arrayList.get(0).getMath();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMath()>Max) {
					Max = arrayList.get(i).getMath();
					
					
				}
				
			}
			
		}
		
		
		if (subject.equals("Ӣ��")) {
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
