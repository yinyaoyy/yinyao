package com.yinyao.practice;

import java.util.Vector;

public class dump {

	public static void main(String[] args) {

		double height = 100;
		double d = height / 2; //第一次反弹反弹高度 
		for (int i = 2;i<= 3;i ++){
			height = height + d * 2; //第i次落地经过多少米
		    d = d / 2;//第i次反弹的高度
		}
		System.out.println(height);
		System.out.println(d);
		Vector v = new Vector();
		System.out.println(4&7);
		long time = (int)3.9;
		System.out.println(time);
	}

	
}
