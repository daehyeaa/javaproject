package d;
// package hello 에 있는 PackageHelloWorld.java 참고
// 두클래스가 다른 패키지에 있는 경우네는 
// 다른 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 접근 제어자가 public 접근 제어자로 되어 있어야한다.
// 다른 패키지 안에 들어 있는 클래스에 접근하기 위해서는 해당 클래스를 import를 해야된다.
import hello.PackageHelloWorld;
//   import hello.*;

public class UsePackageHelloWorld {

    public static void main( String[] args ) {
	PackageHelloWorld phw = new PackageHelloWorld();
	phw.printHello();
    }
}
