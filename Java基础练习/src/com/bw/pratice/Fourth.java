package com.bw.pratice;

public class Fourth {

	/**
	 * ��1,2,3,4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ���
	 * 
	 * @param args
	 */
	private int[] a = { 1, 2, 3, 4 };// �������鲢��ֵ
	private int num = 0;// ���������λ���ĸ���
	private int hundredNum = 0;// ������ɵ���λ��

	// hundred-��λ, tens-ʮλ, units-��λ
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
		System.out.println("����: " + hn.num);

	}
}
