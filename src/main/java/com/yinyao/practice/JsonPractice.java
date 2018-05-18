package com.yinyao.practice;

import java.util.ArrayList;
import java.util.List;

import cn.yinyao.entity.Student;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonPractice {


	public static void main(String[] args) {
	
		Student s = new Student();
		s.setAge(18);
		s.setUsername("尹垚");
		s.setPassword("xuyue");
		Student s1 = new Student();
		s1.setAge(20);
		s1.setPassword("asdfadf");
		s1.setUsername("sdaewrwer");
		List<Student> list = new ArrayList<Student>();
		list.add(s);
		list.add(s1);
		JSONObject json = JSONObject.fromObject(s);
		JSONArray jsonList = JSONArray.fromObject(list);
		String str = json.toString();
		System.out.println(jsonList.toString());
		JSONArray a = JSONArray.fromObject(jsonList.toString());
		List<Student> ss = JSONArray.toList(a,Student.class);
		System.out.println(ss.get(0).getAge());
}
}
