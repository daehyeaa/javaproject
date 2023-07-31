package p2023_07_31;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	/**
	 * HashSet 테스트
	 */
	// 오름차순으로 정렬해서 값을 저장
	
	// TreeSet
	// 1. 데이터를 오름차순으로 정려래서 저장하고 출력하는 기능을 제공한다.
	// 2. 중복된 데이터를 저장 할 수 없다.
	
	//			오름차순 정렬												내림차순 정렬
	//----------------------------------------------------------------------------------
	// 숫자 : 작은숫자부터 큰숫자 순으로 정렬					숫자: 큰숫자부터 작은숫자 순으로 정렬
	// 문자 : 사전순 정렬 ex)a,b,c----                           사전 역순 정렬
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet hs = new TreeSet();
		
		if(hs.add("korea")){
			System.out.println("첫 번째 korea 추가 성공");
		}
		else{
			System.out.println("첫 번째 korea 추가 실패");
		}
		if(hs.add("japan")){
			System.out.println("japan 추가 성공");
		}
		else{
			System.out.println("japan 추가 실패");
		}
		if(hs.add("america")){
			System.out.println("america 추가 성공");
		}
		else{
			System.out.println("america 추가 실패");
		}
		if(hs.add("britain")){
			System.out.println("britain 추가 성공");
		}
		else{
			System.out.println("britain 추가 실패");
		}
		if(hs.add("korea")){
			System.out.println("두 번째 korea 추가 성공");
		}
		else{
			System.out.println("두 번째 korea 추가 실패");
		}
		
		// 오름차순으로 정렬된 결과 출력
		System.out.println(hs);		// [america, britain, japan, korea]
		
		
		// Iterator(반복자) : america, britain, japan, korea
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			System.out.print(it.next()+"\t");
		} // next(): 데이터를 1개씩 가져오는 역할 		
	}
}
