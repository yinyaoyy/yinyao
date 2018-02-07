package com.yinyao.practice;

import java.time.LocalDateTime;
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
		LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue());     // 1 - 12
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
	}

}
