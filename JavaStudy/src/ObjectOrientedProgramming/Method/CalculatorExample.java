package ObjectOrientedProgramming.Method;

/*
 * 메서드 호출
 */
public class CalculatorExample {
	public static void main(String[] args) {
		//참조변수 생성
		Calculator myCal = new Calculator();
		
		//메서드 호출
		myCal.powerOn();
		
		int result1 = myCal.plus(10, 20);
		System.out.println("result1 : " + result1);
		
		double result2 = myCal.divide(30, 16);
		System.out.println("result2 : " + result2);
	}
}
