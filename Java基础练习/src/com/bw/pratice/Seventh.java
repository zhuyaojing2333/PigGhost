package com.bw.pratice;

public class Seventh {

	/**
	 * 打印出杨辉三角形（要求打印出10行以上）
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 9;

		int a[][] = new int[r + 1][];
		for (int i = 0; i <= r; i++) {
			a[i] = new int[i + 1];
		}
		yanghui(a, r);
	}

	public static void yanghui(int a[][], int r) {
		for (int i = 0; i <= r; i++)
			for (int j = 0; j <= a[i].length - 1; j++) {
				if (i == 0 || j == 0 || j == a[i].length - 1)
					a[i][j] = 1;
				else
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		for (int i = 0; i <= r; i++) {
			for (int j = 0; j <= a[i].length - 1; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}

}
