package com.yinyao.practice;

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
		
        
	}
    

}
