package com.tech1.score;

import java.util.Scanner;

public class ScoreMgr2 {
	public static void main(String[] args) {
		do {
			Scanner sc=new Scanner(System.in);
			int sum=0;
			int max=0;
			int scrArr[]=new int[5];
			System.out.println("5���� ������ �Է��ϼ���");
			for (int i = 0; i < scrArr.length; i++) {
				scrArr[i]=sc.nextInt();
				if (scrArr[i]<50 || scrArr[i]>101) {
					System.out.println("������ �� �� �Է��Ͽ����ϴ�");
					break;
				}
			}
			for (int i = 0; i < scrArr.length; i++) {
				sum+=scrArr[i];
				if (sum<scrArr[i]) {
					max=scrArr[i];
				}
			}
			System.out.println("��� : "+(sum/5));
			scrArr[0]=0;
			System.out.println("���α׷��� �����Ͻðڽ��ϱ�?\n(-1:���α׷�����, 1:���α׷������)");
			
			Scanner sr=new Scanner(System.in);
			int a=sr.nextInt();
				if (a==-1) {
					System.out.println("���α׷��� �����մϴ�");
					break;
				}else if (a==1) {
					continue;
				}
			}while(true);
		return;
	}
}
