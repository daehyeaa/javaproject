package p2023_07_20;

public class Shared {
    public static void main( String[] args ) {
    
        StaticCount sc1 = new StaticCount();
        System.out.println("sc1.number = " + sc1.number);		//3
        
        sc1.number++;	// number 값을 1증가 시킨다.
        System.out.println("sc1.number = " + sc1.number);		//4
        
        // 정적 필드는 공유 영역이므로 가장 마지막의 저장된 값으로 공유 된다.
        
        StaticCount sc2 = new StaticCount();
        System.out.println("sc2.number = " + sc2.number);		//4		
        
        sc2.number++;
        System.out.println("sc2.number = " + sc2.number);		//5
        
        StaticCount.number++;												
        System.out.println(StaticCount.number);					//6
        
    }
}
            
  