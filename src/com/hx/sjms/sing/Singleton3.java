package com.hx.sjms.sing;

/**���������˫��У��ķ�ʽ��������ʽ����ģʽ�����̰߳�ȫ����ͨ�����������Ա�֤ͬʱֻ��һ���߳��ߵ��ڶ����пմ�����ȥ��
 * ������֤��ֻ���� һ��ʵ�������ﻹ�õ���volatile�ؼ���������singleton������ؼ��������Ƿ�ָֹ�����š�*/
public class Singleton3 {

	private static volatile Singleton3 instance;

	private Singleton3() {

	}

	public static Singleton3 getInstance() {
		if (instance==null) {
			synchronized (Singleton3.class) {
				if (instance == null) {
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}

}
