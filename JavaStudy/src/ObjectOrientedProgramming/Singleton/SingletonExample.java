package ObjectOrientedProgramming.Singleton;

/*
 * 싱글톤 객체
 */
public class SingletonExample {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();	컴파일에러!
//		Singleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		//단 하나의 객체만 리턴하므로 obj1과 obj2는 동일한 객체 참조
		if (obj1 == obj2) {
			System.out.println("같은 Singleton입니다.");
		} else {
			System.out.println("다른 Singleton입니다.");
		}
	}
}
