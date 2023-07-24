package p2023_07_18;

// p195
// 객체 배열: 객체를 참조하는 배열
public class ArrayEx09 {
	public static void main(String[] args) {
		
		// String객체를 저장하기 위한 배열
		String[] strArray = new String[3];
		strArray[0] = "Java";		//String 객체를 새성해서 객체배열에 저장
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray.hashCode());
		System.out.println(strArray[0].hashCode());
		System.out.println(strArray[1].hashCode());
		System.out.println(strArray[2].hashCode());
		
		// == 		 : 주소값을 비교
		// equals() : 값을 비교
		System.out.println(strArray[0] == strArray[1]);			//true
		System.out.println(strArray[0] == strArray[2]);			//false
		System.out.println(strArray[0].equals(strArray[2]));	//true
	}
}
