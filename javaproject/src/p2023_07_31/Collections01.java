package p2023_07_31;

import java.util.*;

class Collections01 {
  public static void main(String[] args) {
    Set set = new HashSet();
//	HashSet	set = new HashSet();
	System.out.println("요소의 갯수->"+set.size());
	set.add("하나");	
    set.add(2);
	set.add(3.42);
	set.add("넷");
	set.add("five");
	set.add(6);	
	set.add(6);
	
	// set은 중복 데이터를 저장할 수 없다.
	System.out.println("요소의 갯수->"+set.size());
	System.out.println(set);

	// Iterator(반복자) : 2, 6, 넷, 하나, 3.42, five
	Iterator elements=set.iterator();    
	while(elements.hasNext()) {	//가져올 데이터가 있으때 true 
      System.out.println("\t\t" + elements.next());
	}


/*  Vector에만 적용
	Enumeration enu = set.elements();
	while( enu.hasMoreElements()){
		System.out.println( enu.nextElement() );
	}
*/	
  }    
}                                                                                           
