package com.tech1.score;

import java.util.Scanner;

public class ScoreMgr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int max=0;
		int scrArr[]=new int[5];
		System.out.println("5���� ������ �Է��ϼ���");
		
		for (int i = 0; i < scrArr.length; i++) {
			scrArr[i]=sc.nextInt();
			System.out.println(scrArr[i]);
		}
		for (int i = 0; i < scrArr.length; i++) {
			sum+=scrArr[i];
			if (sum<scrArr[i]) {
				max=scrArr[i];
			}
		}
		
		System.out.println("��� : "+(sum/5));
	}
}
