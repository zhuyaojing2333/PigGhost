package com.bw.pratice;

public class Fifth {

	/**
	 * Çó1+2!+3!+...+20!µÄºÍ
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1!+2!+3!+¡­¡­+20!=" + getSum(20));
	}

	public static long getSum(int n) {
		int i, k, fac, sum = 0;
		for (i = 1; i <= n; i++) {
			fac = 1;
			for (k = 1; k <= i; k++)
				fac = fac * k;
			sum = sum + fac;
		}
		return sum;
	}

}
