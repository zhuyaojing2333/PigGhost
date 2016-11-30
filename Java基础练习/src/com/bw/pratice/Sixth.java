package com.bw.pratice;

public class Sixth {

	/**
	 * 5位数中找出所有，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同
	 * 擦，有问题诶，但是没错啊。。。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入一个五位数:");
		java.util.Scanner input = new java.util.Scanner(System.in);
		String shu = input.next();
		if (shu.length() == 5) {
			if ((shu.charAt(0) == shu.charAt(4)) && (shu.charAt(1) == shu.charAt(2))) {
				System.out.println(shu + "是回文数");
			} else {
				System.out.println(shu + "不是回文数");
			}
		} else {
			System.out.println("您输入的不是五位数！！");
		}

	}

}
