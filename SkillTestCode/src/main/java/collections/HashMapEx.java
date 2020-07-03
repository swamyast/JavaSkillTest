package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("A", "AAAA");
		hm.put("B", "BBB");
		hm.put("C", "CCC");
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		hm.get("A");
		hm.replace("B", "B11");
		
		System.out.println(hm);
		
		hm.forEach((k,v)->System.out.println(k+" key and its value "+v));
		
		for(Map.Entry<String, String> entry:hm.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}
}
