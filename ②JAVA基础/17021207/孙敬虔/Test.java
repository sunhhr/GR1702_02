package com.sjq;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Examinee> arrayList= new ArrayList<Examinee>();
		ExamineeService cService = new ExamineeService();
		Scanner sc = new Scanner(System.in);
		cService.helpinfo();
		int key = 0;
		boolean isquit = true;
		while (isquit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				cService.addExaminee(arrayList, sc);
				break;
			case 2:
				cService.infoExaminee(arrayList);
				break;
			case 3:
				
				
				cService.helpmax();
				boolean isquis = true;
				while (isquis) {
					key = sc.nextInt();
					switch (key) {
					case 1:
						cService.getMax(arrayList, "����");
						break;
					case 2:
						cService.getMax(arrayList, "��ѧ");
						break;
					case 3:
						cService.getMax(arrayList, "Ӣ��");
						break;
					case 4:
						cService.getMax(arrayList,"�ܷ�");
						break;
					case 5:
						isquis = false;
						System.out.println("�˳���߷ֲ�ѯ");
						break;
					default:
						
						break;
					}
				}
			
				System.out.println();
				break;
			case 4:
				isquit = false;
				break;
			default:			
				break;
			}
		}
		System.out.println("�ݰݣ�");	
		}

}

