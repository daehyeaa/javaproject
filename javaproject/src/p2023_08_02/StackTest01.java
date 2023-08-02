package p2023_08_02;

import java.util.*;

public class StackTest01 {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("1-자바"); // 4-MFC
		myStack.push("2-C++"); // 3-API
		myStack.push("3-API"); // 2-C++
		myStack.push("4-MFC"); // 1-자바

		System.out.println(myStack.pop());	//4
		System.out.println(myStack.pop());	//3
		System.out.println(myStack.pop());	//2
		System.out.println(myStack.pop());	//1
		System.out.println(myStack.pop());	// EmptyStackException 오류 발생
		
//		while (!myStack.isEmpty()) {	// Stack이 비어있지 않으면 
//			System.out.println(myStack.pop());
//		}
	}
}
