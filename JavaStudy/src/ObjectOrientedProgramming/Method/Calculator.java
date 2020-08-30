package ObjectOrientedProgramming.Method;

/*
 * 메서드 선언
 */
public class Calculator {
	//powerOn메서드 : 리턴 값 없음 -> 매개변수 없음
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	//plus메서드 : 리턴 값 있음 -> 정수형 매개변수를 받아서 리턴값 반환
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	//divide메서드 : 리턴 값 있음 -> 정수형 매개변수 받아서 리턴값 반환
	double divide(int x, int y) {
		double result = x / y;
		return result;
	}
	
	//powerOff메서드 : 리턴값 없음 -> 매개변수 없음
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
}
