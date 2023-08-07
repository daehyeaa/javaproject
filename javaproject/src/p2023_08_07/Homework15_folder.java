package p2023_08_07;

import java.io.File;

public class Homework15_folder {

	public static void main(String[] args) {

		File test = new File("C:/java01", "test");
		
		test.mkdirs();	// 폴더 생성
		
		// test폴더 안에 있는 내용 리스트 삭제
		for(File f : test.listFiles()) {
			f.delete();
		}
		
		// test폴더 안에 내용물 삭제 후 폴더 삭제
		test.delete();
		
	}

}
