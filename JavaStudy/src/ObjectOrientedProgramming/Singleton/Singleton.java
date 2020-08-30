package ObjectOrientedProgramming.Singleton;

/*
 * 싱글톤
 */
public class Singleton {
	//객체 생성
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() {}
	
	//정적 메서드
	static Singleton getInstance() {
		return singleton;
	}
}
