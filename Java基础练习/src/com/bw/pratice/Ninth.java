package com.bw.pratice;

public class Ninth {

	/**
	 * ��n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean people[] = new boolean[10];
		for (int i = 0; i < 10; i++) {
			people[i] = true;
		}
		rep(people);
		System.out.println("�������������4��10");
	}

	public static void rep(boolean[] people){
		int i = 0, j = 0, n = people.length, m = n;
		while(n > 2){
			i = ++i%m;
			if(people[i] == true){
				j++;
				if(j == 3){
					people[i] = false;
					System.out.println(i);
					n--; //��������һ
					j = 0; //��3��ͷ��
				}
			}
		}
	}
}
