package com.bw.pratice;

import java.util.Scanner;

public class Second {

	/**输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("input a string:");
		String string=input.nextLine();

		int letter=0;
		int number=0;
		int blank=0;
		int other=0;
		for(int i=0;i<string.length();i++)
		{
		if((string.charAt(i)>=65&&string.charAt(i)<=90)||(string.charAt(i)>=97&&string.charAt(i)<=122))
		letter++;
		else if(string.charAt(i)>48&&string.charAt(i)<=57)
		number++;
		else if(string.charAt(i)==32)
		blank++;
		else
		other++;
		}
		System.out.println("有"+letter+"个字母,"+number+"个数字,"+blank+"个空格,"+other+"个其他字符.");

	}

}
