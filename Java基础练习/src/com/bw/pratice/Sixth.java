package com.bw.pratice;

public class Sixth {

	/**
	 * 5λ�����ҳ����У��ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ
	 * ������������������û��������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������һ����λ��:");
		java.util.Scanner input = new java.util.Scanner(System.in);
		String shu = input.next();
		if (shu.length() == 5) {
			if ((shu.charAt(0) == shu.charAt(4)) && (shu.charAt(1) == shu.charAt(2))) {
				System.out.println(shu + "�ǻ�����");
			} else {
				System.out.println(shu + "���ǻ�����");
			}
		} else {
			System.out.println("������Ĳ�����λ������");
		}

	}

}
