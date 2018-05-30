import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

public static void main(String[] args) {
	
	Map<String, String> map = new HashMap<String, String>();
    map.put("apple", "苹果");
    map.put("watermelon", "西瓜");
    map.put("banana", "香蕉");
    map.put("peach", "桃子");

    Iterator iter = map.entrySet().iterator();
    while (iter.hasNext()) {
        Map.Entry entry = (Map.Entry) iter.next();
        System.out.println(entry.getKey() + "=" + entry.getValue());
    }
    Map<String, String> map1 = new LinkedHashMap<String, String>(16,0.75f,true);
    map1.put("apple", "苹果");
    map1.put("watermelon", "西瓜");
    map1.put("banana", "香蕉");
    map1.put("peach", "桃子");

    Iterator iter1 = map1.entrySet().iterator();
    while (iter1.hasNext()) {
        Map.Entry entry1 = (Map.Entry) iter1.next();
        System.out.println(entry1.getKey() + "=" + entry1.getValue());
    }
    List<Integer> list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.set(2, 4);
    for(int i:list) {
    	System.out.println(i);
    }
}
	
}
