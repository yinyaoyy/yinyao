package general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class simple {

	public static void main(String[] args) throws InterruptedException {
//
//		int[] i=new int[10];
//		System.out.println(i[9]);
//		List<Map<String,Integer>> l = simple.get();
//		for(int i1 = 0;i1<l.size();i1++) {
//			Map<String,Integer> map = l.get(i1);
//			for(Entry<String,Integer> en:map.entrySet()) {
//				System.out.println(en.getKey()+":"+en.getValue());
//			}
//			
//		}
		
		for(int i = 0;i<100;i++) {
			new ThreadTest().start();
			System.out.println("i="+i);
			Thread.sleep(3000);
			System.out.println("i="+i);
		}
	
	}

	public static  List get() {
		List<Map<String,Integer>> list = new ArrayList<Map<String,Integer>>();
		Map<String,Integer> map = new TreeMap<String,Integer>();
		map.put("value", 255);
		map.put("id", 255);
		list.add(map);
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		map1.putAll(map);
		list.add(map1);
		map1.put("value",259);
		map1.put("id",12);
		return list;
		
	}
	
}
class ThreadTest extends Thread{
	
	static int i =0;
	public void run() {
		for(int i = 0;i<100;i++) {
			ThreadTest.i++;
		}
		System.out.println(i);
	}
}
