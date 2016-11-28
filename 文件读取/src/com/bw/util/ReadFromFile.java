package com.bw.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ���ַ�ʽ���ļ�
 * 1.���ֽڶ�ȡ�ļ�����
 * 2.����Ϊ��λ��ȡ�ļ��������ڶ������еĸ�ʽ���ļ�
 * @author PigGhost
 *
 */
public class ReadFromFile {

	/**
	 * @param args
	 */
	public static void readFileByBytes(String fileName){
		File file = new File(fileName);
		
		InputStream is = null;
		
		try {
			System.out.println("���ֽ�Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���ֽ�");
			
			//һ�ζ�һ���ֽ�
			is = new FileInputStream(file);
			
			int tempbyte;
			
			while((tempbyte = is.read()) != -1){
				System.out.println(tempbyte);
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
	
	public static void ReadFileByLine(String fileName){
		File file = new File(fileName);
		
		BufferedReader br = null;
		
		try {
			System.out.println("����Ϊ��λ��ȡ�ļ��������ڶ������еĸ�ʽ���ļ�");
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

			String str = null;
			
			int line = 1;
			
			while((str = br.readLine()) != null){
				System.out.println("line" + line + ":" + str);
				line++;
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
