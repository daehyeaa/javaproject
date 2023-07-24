package p2023_07_20;

public class UseNoneObject {

    public static void main( String[] args ) {
    
    NoneObject no = new NoneObject();		//객체 생성후 
    System.out.println("no.number = " + no.number); //객체 생성 후 필드 
    no.printNumber();
    
    // 정적필드와 정적 메소드는 객체를 생성하지 않고 정적필드를 가진 클래스명으로 dot(.)으로 접근해서 사용한다.
    // 정적필드와 메소드는 힙영역에 생성되는것이 아니라 공유영역 (메소드영역)에 존재한다.
    // 정적 필드와 메소드는 프로그램이 종료 될때 까지 존재한다.
    // 정적필드로 접근해서 출력함 : 클래스.정적필드명
    System.out.println("NoneObject.number = " + NoneObject.number);
    
    // 정적메소드를 호출함 : 클래스.정적메소드명
    NoneObject.printNumber();	
    
    }
}