package ObjectOrientedProgramming.Method;

/*
 * 리턴문
 */
public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메서드
	// 리턴값이 없는 메서드로 매개값을 받아서 gas필드 값 변경
	void setGas(int gas) {
		this.gas = gas;
	}
	
	//리턴값이 boolean인 메서드로 gas필드값이 0 이면 false를, 0이 아니면 true를 반환
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
	//리턴값이 없는 메서드로 gas필드값이 0 이면 return문으로 메서드 종료
	void run() {
		while(true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량 : " + gas + ")" );
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량 : " + gas + ")");
				return;
			}
		}
	}
}
