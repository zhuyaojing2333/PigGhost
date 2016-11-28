package com.bw.util;

public class RecursionTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count(8);
		System.out.println();
	}
	
	public static void count(int n){
		//µÝ¹é·½·¨
		if(n<50){
			count(n + 1);
			System.out.println("----"+n);
		}
	}
}
