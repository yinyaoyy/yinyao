package com.yinyao.practice;

public class ThreadTest  extends Thread{

	public void run() {
		System.out.println(Sing.getInstence().hashCode());
	}
	public static void main(String[] args) {
		ThreadTest[] s = new ThreadTest[100];
		for (int i = 0; i < s.length; i++) {
			s[i] = new ThreadTest();
		}
		for (int i = 0; i < s.length; i++) {
			s[i].start();
		}
	}
}
