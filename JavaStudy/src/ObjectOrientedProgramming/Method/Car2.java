package ObjectOrientedProgramming.Method;

/*
 * 클래스 외부에서 메서드 호출
 */
public class Car2 {
	//필드
	int speed;
	
	//생성자(기본 생성자)
	
	//메서드
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for (int i = 10; i <= 50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속:" + speed + "km/h)");
		}
	}
}
