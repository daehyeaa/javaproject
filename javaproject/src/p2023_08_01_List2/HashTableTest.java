package p2023_08_01_List2;

import java.util.*;

class HashTableTest {
  public static void main(String[] args) {
	
	  // 1. 업캐스팅이 되면 참조 가능한 영역의 축소가 일어난다.
	  // 2. 업캐스팅이 되면 부모가 상속해준 메소드만 접근 할 수 있다.
	  // 3. key() 메소느는 부모인 Map이 상속해준 메소드가 아니기 때문에 업캐스팅 방식으로 Map객체를 생성하면 사용
	  // 할 수 없다.
	  
	  //Map ht = new Hashtable();			// 업캐스팅이 되면 안된다.
	  // keys() 메소드는 Map에서 제공하는 메소드가 아니라 Hashtable 클래스에서 제공하는 메소드이기 때문에 
	  //Hashtable hh = new Hashtable(); 해야한다.
	  // Hashtable<K,V> 제니릭 해줘야 한다.
	  Hashtable ht= new Hashtable();
     // 해쉬 테이블에 키/데이터를 입력한다.
	  //pub(Object key, Object value)
	 ht.put("딸기", "StrawBerry");
     ht.put("사과", "Apple");     
     ht.put("포도", "Grapes");
     ht.put("count", 10);

     
     // 방법1. key를 알고 있는 경우
     // Object get(Object key)
     // 해쉬 테이블의 값을 키를 이용하여 얻는다.
	 //  Object obj = ht.get("포도");
     String Val = (String)ht.get("포도");		//다운 캐스팅
     if(Val != null) {
       System.out.println("포도-> " + Val);
     }  
     
     String s = (String)ht.get("딸기");	// 다운 캐스팅
     String a = (String)ht.get("사과");
     Integer i = (Integer)ht.get("count");	// 다운캐스팅
     int ii = i.intValue();	// 언박싱
     
     //다운캐스팅 + 언박싱
     int jj = ((Integer)ht.get("count")).intValue();

     // 방법2. key를 모르는 경우
     // 키를 먼저 구해오고 값을 구해오는 경우
     // 열거형(Enumeration) : 딸기, 사과, 포도 
     Enumeration Enum = ht.keys();		// Map의 모든 key를 구해옴 
     while(Enum.hasMoreElements()){
         Object /*String*/  k = /*(String)*/Enum.nextElement();
         Object/*String*/  v = /*(String)*/ht.get(k);
         System.out.println(k + " : "+ v );
     }
   }    
}                                                
