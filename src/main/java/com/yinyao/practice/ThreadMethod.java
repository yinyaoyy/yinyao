package com.yinyao.practice;



public class ThreadMethod {
    int j = 0;
	public synchronized void jia() {
		j++;
	    System.out.println(Thread.currentThread().getName()+":"+j);
	}
	public synchronized void jian() {
		j--;
		 System.out.println(Thread.currentThread().getName()+":"+j);
	}
}
