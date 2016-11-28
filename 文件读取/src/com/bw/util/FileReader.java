package com.bw.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class FileReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// file(内存)----输入流---->【程序】----输出流---->file(内存)
		File file = new File("d:/ppppp.txt");
		
		try {
			//创建文件
			file.createNewFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//向文件中写入内容
		String str = "亲爱的猪妖精大人";
		byte[] b = new byte[1024];
		b = str.getBytes();
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			
			fos.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//读取文件内容(输入流)
		try {
			FileInputStream fis = new FileInputStream(file);
			
			InputStreamReader isr = new InputStreamReader(fis);
			
			int i = 0;
			
			while((i = isr.read()) != -1){
				System.out.println((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//以字节为单位读取文件内容，一次读一个字节
		ReadFromFile.readFileByBytes("d:/ppppp.txt");
		
		//以行为单位读取文件，常用于读面向行的格式化文件 
		ReadFromFile.ReadFileByLine("d:/ppppp.txt");
	}

}
