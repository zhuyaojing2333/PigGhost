package com.bw.pratice;

import java.util.Scanner;

public class Third {

	/**
	 * �ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ����
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		System.out.println("��������ֳ���ӵ��·�����");
		Scanner in = new Scanner(System.in);
		month = in.nextInt();

		int sum[] = new int[month];
		sum[0] = 1;
		sum[1] = 1;

		for (int i = 2; i < month; i++) {
			sum[i] = sum[i - 1] + sum[i - 2];
		}

		System.out.println("��" + month + "���µ����������ǣ�" + sum[month - 1]);
	}

}
