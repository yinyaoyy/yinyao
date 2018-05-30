package com.yinyao.practice;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringPractice extends wode{

	@Override
	protected int find() {
		// TODO Auto-generated method stub
		return 0;
	}
      int a = super.add("1");
	@Override
	public String find(int a) {
		// TODO Auto-generated method stub
		return null;
	}
     public static void main(String[] args) {
		String a = "123";
		int aa = Integer.parseInt(a);
		System.out.println(aa);
		int aaa = 123;
		String ss = String.valueOf(aaa);
		System.out.println(ss.getClass().getName());
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("1");
		set.add("2");
		System.out.println(set.size());
		for(String str:set) {
			System.out.println(str);
		}
		
       List<String> list = new ArrayList<String>();
       list.add("1");
       list.add("2");
       list.add("3");
       list.add("4");
       boolean b = list.contains("6");
       System.out.println(b);
       
       String card = "370983199206272330";
       String str = card.substring(6,14);
       StringBuffer buf = new StringBuffer();
       buf.append(str.substring(0, 4));
       buf.append("-");
       buf.append(str.substring(4, 6));
       buf.append("-");
       buf.append(str.substring(6));     
       System.out.println(buf.toString());
       String str1 = "12345678910";
       char[] ch = str1.toCharArray();
       System.out.println(ch.length);
       File file = new File("e:/install");
       File[] files = file.listFiles();
      for (int i = 0; i < files.length; i++) {
		if(files[i].isDirectory()) {
			System.out.println(files[i]);
		}
	}
	}
    

}
