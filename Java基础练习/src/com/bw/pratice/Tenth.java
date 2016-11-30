package com.bw.pratice;

public class Tenth {

	/**
	 * 求100之内的素数    //使用除sqrt(n)的方法求出的素数不包括2和3
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//循环100以内的数
		for (int n = 1; n <= 100; n++) {
			boolean b = true;
			//如果循环拿刀的数n不等于1，就进入下面循环
			if(n != 1){
				//i从大于1的第一个数也就是2开始，一次循环到比这个数n本身小的最大的数
				//何为质数，除了1和他本身不能再被其他数整除。所以...这样循环
				for(int i = 2; i < n; i++){
					//如果取余为0，也就是除了1和其本身有其他数可以乘除他，所以置为false
					if(n % i == 0){
						b = false;
						//跳出当前循环，判断是否打印，并且到外面循环继续
						break;
					}
				}
			}
			//如果b为true打印下面的质数
			if(b){
				System.out.println(n+"是素数");
			}
		}
	}

}
