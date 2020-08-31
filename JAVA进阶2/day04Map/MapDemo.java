package day04Map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("����","������");
		map.put("�","������");
		map.put("�˳�","��ٳ");
		
		
		Set<String> keys = map.keySet();
		
		Set<java.util.Map.Entry<String, String>> entrySet= map.entrySet();
		
		for(java.util.Map.Entry<String, String> entry: entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"��CP��:"+value);
		}
		
		
		for(String key : keys) {
			String value = map.get(key);
			System.out.println(key+"��CP��:"+value);
		}
		
		
	}

}
