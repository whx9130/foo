package com.hx.sjms.sing;

/**这里采用了双重校验的方式，对懒汉式单例模式做了线程安全处理。通过加锁，可以保证同时只有一个线程走到第二个判空代码中去，
 * 这样保证了只创建 一个实例。这里还用到了volatile关键字来修饰singleton，其最关键的作用是防止指令重排。*/
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
