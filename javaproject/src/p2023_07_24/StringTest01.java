package p2023_07_24;
// toUpperCase() : 문자를 대문자로 변환해주는 메소드
// toLowerCase() : 소문자로 변환 해주는 역할
class StringTest01 {

	// String 클래스
	// 1. string 객체를 생성한 후에 메소드에 의해서 값의 변화가 일어나면 변경된 값을 힙메모리 영역에 다시 저장한다. 쓸수 없는 값들을 정리하는것을 가비지 콜렉션(컬렉션) 
	// 2. 힙메모리 영역에 변경된 값을 재사용 하기 위해서는 새로운 변수로 변경된 값을 저장해서 사용해야 된다.
	// ex) String str2 = str1.toUpperCase();
	// 3. 힙메모리 영역에 변경된 값을 재사용 할 수 없을 경우에는 쓰레기로 인식하고 힙메모리 영역의 데이터를 가비지 콜렉터 프로그램이 모아서 지워버린다.
	// ex) str1.toUpperCase(); 참조하는 주소가 없기 때문에 기능을 수행하지만 수행 후 바로 지워진다.
	// 4. Garbage Collection 기능 (쓰레기 수집 기능) - 재사용할 수 없는 힙메모리 영역의 데이터를 모아서 지워주는 기능
	public static void main(String[] args) {
		String str1 = "Java Programming";
		str1.toUpperCase(); // 메서드 호출 후에도  이것은 값을 참조변수 저장하지 않고 메소드만 호출 하기 때문에 garbage가 되어 후에 
		// garbage가 되어 GC에 의해 힙메모리 영역에서 지워진다.
		System.out.println(str1); // str1의 내용은 수정되지 않는다. 
		System.out.println(str1.toUpperCase()); // 출력 후 바로 삭제

		String str2 = str1.toUpperCase(); // 메소드의 처리 결과를 str2에 저장
		System.out.println(str2);
	}
}