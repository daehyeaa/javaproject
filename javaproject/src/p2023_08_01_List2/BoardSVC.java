package p2023_08_01_List2;

// DAO(Data Access Object) 클래스

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {

	ArrayList<BoardVO> boardList;	//필드 
	// 필드에서 선언하면 해당 클래스안에서는 사용이 가능하다.
	// 생성자 안에 선언하면 객체를 생성해야 사용할 수 있기 때문에 
	// 밖에 선언했다.
	
	
	public BoardSVC(){	// 생성자
		boardList =  new ArrayList<BoardVO>();
		// 생성자에서 arraylist 생성해주지 않으면 이 소스에서는 생성해줄때가 없다 .
		// 생성자에 arraylist을 만들었기때문에 자동으로 arraylist을 생성했다.
	}
	
	// 글 입력  처리 메소드
	public void writeArticle(Scanner sc){
		System.out.println("게시판에 글을 작성 하세요?");
		System.out.print("작성자:");
		String register=sc.next();
		
		System.out.print("이메일:");
		String email=sc.next();
		
		System.out.print("비밀번호:");
		String passwd=sc.next();
		
		System.out.print("제목:");
		String subject=sc.next();
		
		System.out.print("글내용:");
		String content=sc.next();
		
		
		BoardVO boardVO=new BoardVO(register,subject,email,content,passwd);
		//boardVo.register = "홍길동"; 오류발생 필드의 접근제어자가 private이기 때문에
		addArticle(boardVO);		
	}
	
	// 글 작성
	private void addArticle(BoardVO boardVO){
		boardList.add(boardVO);
	}
	
	// 글목록 출력
	public void listArticles(Scanner sc){
		if(boardList.size()>0){
			for(int i=0; i<boardList.size(); i++){
				System.out.println(boardList.get(i).toString());
			}
		}else{
			System.out.println("등록된 글이 없습니다.");
		}
	}
	
	// 삭제할 글의 작성자 및 비밀번호 입력하는 메소드
	public void removeArticle(Scanner sc){
		System.out.println("저장할 글의 작성자와 비밀번호를 입력 하세요?");
		System.out.print("작성자:");
		String register=sc.next();
		
		System.out.print("비밀번호:");
		String passwd=sc.next();
		
		removeArticle(register,passwd);
	}
	
	//글 삭제
	public void removeArticle(String register, String passwd){
		if(boardList.size()>0){
			int index=-1;
			for(int i=0; i<boardList.size(); i++){
				if(boardList.get(i).getRegister().equals(register)){
					if(boardList.get(i).getPasswd().equals(passwd)){
						boardList.remove(boardList.get(i));
						index=i;
					}
				}
			}
			if(index==-1){
				System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
				return;
			}
		}else{
			System.out.println("작성된 글이 존재하지 않습니다.");
		}
	}
}
