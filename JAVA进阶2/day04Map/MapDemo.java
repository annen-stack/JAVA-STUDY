package day04Map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("文章","马伊利");
		map.put("李晨","范冰冰");
		map.put("邓超","孙俪");
		
		
		Set<String> keys = map.keySet();
		
		Set<java.util.Map.Entry<String, String>> entrySet= map.entrySet();
		
		for(java.util.Map.Entry<String, String> entry: entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"的CP是:"+value);
		}
		
		
		for(String key : keys) {
			String value = map.get(key);
			System.out.println(key+"的CP是:"+value);
		}
		
		
	}

}
