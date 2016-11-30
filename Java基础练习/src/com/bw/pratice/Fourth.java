package com.bw.pratice;

public class Fourth {

	/**
	 * 有1,2,3,4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少
	 * 
	 * @param args
	 */
	private int[] a = { 1, 2, 3, 4 };// 定义数组并赋值
	private int num = 0;// 定义组成三位数的个数
	private int hundredNum = 0;// 定义组成的三位数

	// hundred-百位, tens-十位, units-个位
	public int hundNumber(int hundred, int tens, int units) {
		return 100 * hundred + 10 * tens + 1 * units;
	}

	public static void main(String[] args) {
		Fourth hn = new Fourth();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int m = 0; m < 4; m++) {
					if (hn.a[i] != hn.a[j] && hn.a[j] != hn.a[m]
							&& hn.a[m] != hn.a[i]) {
						hn.hundredNum = hn
								.hundNumber(hn.a[i], hn.a[j], hn.a[m]);
						hn.num++;
						System.out.println(hn.hundredNum);
					}
				}
			}
		}
		System.out.println("共有: " + hn.num);

	}
}
