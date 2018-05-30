package com.yinyao.practice;

public class Singleton {
	private Singleton() {}
	private static Singleton s;
	public synchronized static Singleton getInstence() {
		synchronized (Singleton.class) {
			if(s==null) {
				s = new Singleton();
			}
		}
		
		return s;
	}
	
}
class Sing{
	private Sing() {}
	private static Sing s = new Sing();
	public static Sing getInstence() {
		return s;
	}
	
}
