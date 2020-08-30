package ObjectOrientedProgramming.Member;

/*
 * 정적 메서드와 블록 선언 시 주의할 점
 * 정적 메서드와 정적 블록에서 인스턴스 멤버를 사용하고 싶을땐
 * new 클래스명() 으로 먼저 객체를 생성하고 참조변수로 접근
 */
public class Car {
	//필드
	int speed;
	//메서드
	void run() {
		System.out.println(speed + "으로 달린당!");
	}
	
	//정적 메서드에서 인스턴스 멤버 쓰려면 객체 먼저 생성!
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
