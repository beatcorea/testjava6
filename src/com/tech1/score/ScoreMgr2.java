package com.tech1.score;

import java.util.Scanner;

public class ScoreMgr2 {
	public static void main(String[] args) {
		do {
			Scanner sc=new Scanner(System.in);
			int sum=0;
			int max=0;
			int scrArr[]=new int[5];
			System.out.println("5개의 점수를 입력하세요");
			for (int i = 0; i < scrArr.length; i++) {
				scrArr[i]=sc.nextInt();
				if (scrArr[i]<50 || scrArr[i]>101) {
					System.out.println("점수를 잘 못 입력하였습니다");
					break;
				}
			}
			for (int i = 0; i < scrArr.length; i++) {
				sum+=scrArr[i];
				if (sum<scrArr[i]) {
					max=scrArr[i];
				}
			}
			System.out.println("평균 : "+(sum/5));
			scrArr[0]=0;
			System.out.println("프로그램을 종료하시겠습니까?\n(-1:프로그램종료, 1:프로그램재시작)");
			
			Scanner sr=new Scanner(System.in);
			int a=sr.nextInt();
				if (a==-1) {
					System.out.println("프로그램을 종료합니다");
					break;
				}else if (a==1) {
					continue;
				}
			}while(true);
		return;
	}
}
