package com.yinyao.practice;

import java.util.ArrayList;
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
		
		//System.out.println(a);
		for(int t:list) {
			//System.out.println(t);
		}
		/*LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue());     // 1 - 12
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);*/
		List l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(2);
		String s = l.iterator().next().toString();
		System.out.println(l.size());
		
		/*List ll = new ArrayList();
		if(ll!=null&&ll.size()!=0){
			System.out.println("奥术大师");
		}
		
		List lll = new ArrayList();
		Student sss ; ;
		for(int i=0;i<5;i++){
			sss = new Student();
			sss.setAge("12");
			sss.setName("woshi");
			lll.add(sss);
		}
		System.out.println(lll.get(0));
		int aa = 0;
		if(1>0){
			aa=8;
		}

		System.out.println(aa);*/
		String str = System.getProperty("catalina.base");
		System.out.println(str);
		Object o = new Object();
		
	}

}
