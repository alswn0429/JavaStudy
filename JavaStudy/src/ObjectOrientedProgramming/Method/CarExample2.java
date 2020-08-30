package ObjectOrientedProgramming.Method;

/*
 * 클래스 외부에서 메서드 호출
 * 객체 먼저 생성 후 메서드 이용 가능!
 */
public class CarExample2 {
	public static void main(String[] args) {
		Car2 myCar = new Car2();	//기본 생성자
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : " + speed + "km/h");
	}
}
