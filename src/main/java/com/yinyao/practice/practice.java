package com.yinyao.practice;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class practice {

	public static void main(String[] args) {

		Queue<Integer> list = new ArrayBlockingQueue<Integer>(10);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		int a = list.peek();
		System.out.println(a);
		for(int t:list) {
			System.out.println(t);
		}
	}

}
