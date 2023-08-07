package p2023_08_07;

// File 클래스는 데이터들이 입.출력 하면서 사용하는 파일이나
// 디렉토리 체제를 관리하는 클래스임.

import java.io.File;
import java.util.Arrays;

public class FileTest {

	public static void main(String[] args) {
		try {
			// File 객체 생성
			// c:/java01/temp 폴더가 생성되고, 현 위치 하위에
			// test폴더가 생성됨 // 경로 하위폴더
			File temp = new File("C:/java01", "temp"); // java api 에서 File(String paraent, String child)
			File tempFile = new File("test"); // File(String pathname)
			File filePath = null;
			//File [] filePath = null;
			// 디렉토리 생성(mkdirs()는 디렉토리를 만들면 true를 아니면 false
			// 반환함)
			System.out.println("create directory state : " + temp.mkdirs()); // 실제 생성는 이 메소드 사용해야함
			System.out.println("create directory state : " + tempFile.mkdirs()); // 실제 생성는 이 메소드 사용해야함
			
//			for(File filePath1 : tempFile.listFiles()) {
//				filePath1.delete();
//			}
			
			File[] fileArr = tempFile.listFiles();
			File fileArr1;
			for(int i=0; i<fileArr.length; i++) {
				fileArr1 = fileArr[i];
				fileArr1.delete();
			}
			
			
//	    1. 디렉토리 삭제 : 비어있는 디렉토리가 삭제됨
			// tempFile.delete();

//		2. 비어있지 않는 디렉토리 삭제(과제) //특정파일을 구해오는 메소드를 구해온다 배열형태로 구해온다.

//		3. 자식 디렉토리 삭제
			// temp.delete(); // temp 디렉토리 삭제

//		4. 부모 디렉토리 삭제
			// temp.getParentFile().delete();

			// File 클래스에서 제공하는 메소드로 파일 시스템에 대한
			// 여러가지 정보를 얻을수 있음

//	    System.out.println( "temp canRead : " + temp.canRead() );
//	    System.out.println( "temp canWrite : " + temp.canWrite() );
//	    System.out.println( "temp getAbsoluteFile : " + temp.getAbsoluteFile());
//	    System.out.println( "temp getName : " + temp.getName() );
//	    System.out.println( "temp getParent : " + temp.getParent() );
//	    System.out.println( "temp getPath : " + temp.getPath() );
//	    System.out.println( "temp isDirectory : " + temp.isDirectory() );
//	    System.out.println( "temp isFile : " + temp.isFile() );
			} catch (Exception e) {}
	}
}
