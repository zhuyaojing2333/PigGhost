package com.bw.pratice;

import java.util.Scanner;

public class Third {

	/**
	 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		System.out.println("请输入养殖兔子的月份数：");
		Scanner in = new Scanner(System.in);
		month = in.nextInt();

		int sum[] = new int[month];
		sum[0] = 1;
		sum[1] = 1;

		for (int i = 2; i < month; i++) {
			sum[i] = sum[i - 1] + sum[i - 2];
		}

		System.out.println("第" + month + "个月的兔子总数是：" + sum[month - 1]);
	}

}
