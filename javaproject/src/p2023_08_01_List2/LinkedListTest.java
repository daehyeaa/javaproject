package p2023_08_01_List2;

import java.util.*;
// Queue 는 자체 객체 생성 불가 하여 LinkedList을 사용한다.
class LinkedListTest {
	public static void main(String[] args) {

		
		// 큐(Queue) : FIFO(First Input First Output)구조
		// Queue는 인터페이스이기 때문에 자체적으로 객체 생성을 할 수 없다.
		// Queue q = new Queue(); 
		
		Queue que = new LinkedList();
		LinkedList myQue = new LinkedList();
		myQue.offer("1-자바");
		myQue.offer("2-C++");
		myQue.offer("3-API");
		myQue.offer("4-MFC");

		System.out.println(myQue.poll());	// 1-자바
		System.out.println(myQue.poll());// 2-C++
		System.out.println(myQue.poll());// 3-API
		System.out.println(myQue.poll());// 4-MFC
		System.out.println(myQue.poll());	// null
		// 큐(Queue)가 비어 있으면 null값을 리턴함
		
		while (myQue.peek() != null) // 큐가 비어있지 않다면
			System.out.println(myQue.poll()); // 큐에서 데이터를 꺼내온다.
		
	}
}