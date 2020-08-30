package ObjectOrientedProgramming.Method;

/*
 * 클래스 내부에서 메서드 호출
 */
public class Calculator2 {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);	//plus메서드 호출
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);		//avg메서드 호출
		println("실행결과 : " + result);	//println메서드 호출
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
