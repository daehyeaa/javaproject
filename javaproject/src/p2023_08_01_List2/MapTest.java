package p2023_08_01_List2;

import java.util.*;

//iv. Map 인터페이스  - HashMap, HashTable (상속받는 클래스)
//1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
//  ex) int, double, char, boolean, String etc
//2. Data를 저장할 때 Key, Value 를 동시에 저장한다.
//3. key 값은 중복이 되면 안된다.
//   만약에 중복된 key가 있으면, 가장 마지막에 설정된 value만 사용할 수 있다.
//4. value값은 중복이 되어도 상관없다.	

public class MapTest {
	public static void main(String[] args) {
		// HashMap 객체 생성
//		Map hm = new HashMap();
		
		// Map은 인터페이스이기 때문에 자체적으로 객체 생성을 할 수 없다.
		//Map m = new Map(); // 오류발생
		
		HashMap<String, Object> hm = new HashMap<String, Object>();
		// 키와 데이터 쌍을 삽입
		hm.put("woman", "gemini");
		hm.put("man", "johnharu");
		hm.put("age", new Integer(10));
		hm.put("city", "seoul");
		hm.put("city", "busan");	// key값이 중복되면 가장 마지막의 value 값만 사용가능하다.
		

		
		// HashMap에 있는 객체들을 출력
		System.out.println(hm);
		ArrayList list = new ArrayList();
		// 키 값만 출력
		System.out.println(hm.keySet());
		System.out.println("-------------------------");
		for (Object key : hm.values()) {
			  System.out.println(key);
			  list.add(key);
			}
		
		
		
		System.out.println("------------------------------");
		System.out.println(list);
		
		for(String s : hm.keySet()) {
			System.out.println(s + "벨류"+ hm.get(s));
		}
		
		
		System.out.println("ddd"+Object.class.getName());
		// 키를 이용해 해당 데이터를 출력
		// Object get(Object key)
		System.out.println(hm.get("woman"));	// map.get("키값");
		System.out.println(hm.get("city"));
	}
}
/*
 *   entrySet() , keySet(), iterator() Map인터페이스에서 제공하는 메소드
 *   Set<Map.Entry<K, V>>
 *   entrySet() 메소드는 Map의 모든 키값 쌍(entry)들을 하나의 Set으로 반환
 *   
 *   Map<String, Integer> map = new HashMap<>();
			map.put("A", 1);
			map.put("B", 2);
			
			Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
			for (Map.Entry<String, Integer> entry : entrySet) {
			    String key = entry.getKey();
			    Integer value = entry.getValue();
			    // Do something with key and value
			}
 *   
 *   keySet()
 *   Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);

		Set<String> keySet = map.keySet();
		for (String key : keySet) {
    		Integer value = map.get(key);
    		// Do something with key and value
		}
		
		iteraotr() 
		
		iterator():

		iterator() 메소드는 Map의 엔트리들을 순회하는데 사용되는 Iterator를 반환합니다.
		반환형은 Iterator<Map.Entry<K, V>>이며, Map.Entry<K, V>는 키와 값의 쌍을 나타내는 인터페이스입니다.
		Iterator는 일반적으로 while 루프를 통해 hasNext()와 next() 메소드를 사용하여 반복하며, 각 엔트리에서 키와 값을 추출할 수 있습니다.
		entrySet(): 키-값 쌍을 하나의 Set으로 반환하여 모든 엔트리를 반복하고, 각 엔트리에서 키와 값을 추출할 수 있습니다.
		keySet(): 키를 하나의 Set으로 반환하여 모든 키를 반복할 수 있습니다.
		iterator(): Map의 엔트리들을 순회하는데 사용되는 Iterator를 반환하여 각 엔트리에서 키와 값을 추출할 수 있습니다.
 */

