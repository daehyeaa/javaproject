package p2023_08_01_List2;

import java.util.List;
import java.util.Vector;

//p.561 ~ 562

class Board extends Object{
	String subject;		//필드
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
}

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제네릭(Generic) : 자료구조에 특정 자료형의 데이터만 저장할 수 있도록 만들어주는 역할
		// Vector 자료구조에는 Board 클래스로 만든 객체만 저장할 수 있다.
																					// 자식객체를 부모객체로 보내는거
			List<Board> list =  new Vector<Board>();	// 업캐스팅
																					// 상속관계여야 한다.
			
			// boolean add(Object e) : Object e = new Board();
			list.add(new Board("제목1","내용1","글쓴이1"));
			list.add(new Board("제목2","내용2","글쓴이2"));
			list.add(new Board("제목3","내용3","글쓴이3"));
			list.add(new Board("제목4","내용4","글쓴이4"));
			list.add(new Board("제목5","내용5","글쓴이5"));
			
			list.remove(2);		// 인덱스 2번 원소(객체)를 삭제
			list.remove(3);		// 인덱스 3번 원소(객체)를 삭제

			// Object get(int index)
			for(int i=0; i<list.size(); i++) {
				System.out.println("list "+list.getClass().getSimpleName()); 
				// 제네릭을 사용하면, 부모인 Object형을 자식클래스인 Board 클래스형으로 자료형 변환을 할 때
				// 제네릭으로 설정된 자료형은 생략이 가능하다. 
				/// Object 형 ----> Board형으로 변환
				Board board = (Board)list.get(i);	// 제네릭으로 설정된 자료형은 생략이 가능하다. Board
				Object b =list.get(i);
				
				System.out.println(board.subject+"\t"+ board.content+"\t"+ board.writer);
			}
	}

}
