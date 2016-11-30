package com.bw.pratice;

public class Ninth {

	/**
	 * 有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位
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
		System.out.println("最后留下来的是4，10");
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
					n--; //总人数减一
					j = 0; //到3从头数
				}
			}
		}
	}
}
