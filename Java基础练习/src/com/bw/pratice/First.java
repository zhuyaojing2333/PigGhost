package com.bw.pratice;

import java.io.File;
import java.util.LinkedList;

public class First {

	/**
	 * 1.������һ���ļ����µ������ļ�����չʾ���㼶��ϵ���ļ���������ʾ�������һ����ʽд���ı��� Ҫ�󣺾����ܼ򵥡��߼�����
	 * ��ѡ�洢��ʽ�ṹҲ�ܿ����㼶��ϵ�����ɶ�д��ֱ��ʹ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		traverseFolder("d:/ʵѵ1/����/���߰�");
	}

	public static void traverseFolder(String path) {
        int fileNum = 0, folderNum = 0;
        File file = new File(path);
        if (file.exists()) {
            LinkedList<File> list = new LinkedList<File>();
            File[] files = file.listFiles();
            for (File file2 : files) {
                if (file2.isDirectory()) {
                    System.out.println("�ļ���:" + file2.getAbsolutePath());
                    list.add(file2);
                    fileNum++;
                } else {
                    System.out.println("�ļ�:" + file2.getAbsolutePath());
                    folderNum++;
                }
            }
            File temp_file;
            while (!list.isEmpty()) {
                temp_file = list.removeFirst();
                files = temp_file.listFiles();
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("�ļ���:" + file2.getAbsolutePath());
                        list.add(file2);
                        fileNum++;
                    } else {
                        System.out.println("�ļ�:" + file2.getAbsolutePath());
                        folderNum++;
                    }
                }
            }
        } else {
            System.out.println("�ļ�������!");
        }
        System.out.println("�ļ��й���:" + folderNum + ",�ļ�����:" + fileNum);

    }
}
