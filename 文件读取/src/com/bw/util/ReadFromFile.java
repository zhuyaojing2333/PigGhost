package com.bw.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 多种方式读文件
 * 1.按字节读取文件内容
 * 2.以行为单位读取文件，常用于读面向行的格式化文件
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
			System.out.println("以字节为单位读取文件内容，一次读一个字节");
			
			//一次读一个字节
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
			System.out.println("以行为单位读取文件，常用于读面向行的格式化文件");
			
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
