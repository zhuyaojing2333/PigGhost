package com.bw.pratice;

public class Tenth {

	/**
	 * ��100֮�ڵ�����    //ʹ�ó�sqrt(n)�ķ������������������2��3
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ѭ��100���ڵ���
		for (int n = 1; n <= 100; n++) {
			boolean b = true;
			//���ѭ���õ�����n������1���ͽ�������ѭ��
			if(n != 1){
				//i�Ӵ���1�ĵ�һ����Ҳ����2��ʼ��һ��ѭ�����������n����С��������
				//��Ϊ����������1�����������ٱ�����������������...����ѭ��
				for(int i = 2; i < n; i++){
					//���ȡ��Ϊ0��Ҳ���ǳ���1���䱾�������������Գ˳�����������Ϊfalse
					if(n % i == 0){
						b = false;
						//������ǰѭ�����ж��Ƿ��ӡ�����ҵ�����ѭ������
						break;
					}
				}
			}
			//���bΪtrue��ӡ���������
			if(b){
				System.out.println(n+"������");
			}
		}
	}

}
