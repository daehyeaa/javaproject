package p2023_08_01_List2;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isStop = false;
		Scanner sc = new Scanner(System.in);	// 객체니깐 
		BoardSVC boardSVC = new BoardSVC();
												// 생성자 호출
		do {
			System.out.println("메뉴를 입력 하세요?");
			System.out.println("1.게시판 글쓰기");
			System.out.println("2.글 목록 보기");
			System.out.println("3.글 삭제");
			System.out.println("4.글 수정");
			System.out.println("5.종료");

			String menu = sc.next();

			switch (menu) {
			case "1":boardSVC.writeArticle(sc);	// sc는 객체 매개변수로 들어간다.
					 break;
			case "2":boardSVC.listArticles(sc);
					 break;
			case "3":boardSVC.removeArticle(sc);
					 break;
//			case "4":boardSVC.updateArticle(sc);
//					 break;
			case "5":isStop = true;
			}

		} while (!isStop);	// isStop 이 아니면 이니깐 계쏙 입력받고 isStop이면 true 에서 !true가되면 false가 되서 반복문을 그만한다.
	}

}
