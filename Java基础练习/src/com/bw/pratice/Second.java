package com.bw.pratice;

import java.util.Scanner;

public class Second {

	/**����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ���
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
		System.out.println("��"+letter+"����ĸ,"+number+"������,"+blank+"���ո�,"+other+"�������ַ�.");

	}

}
