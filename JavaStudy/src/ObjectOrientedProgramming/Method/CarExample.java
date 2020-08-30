package ObjectOrientedProgramming.Method;

/*
 * return문
 */
public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);  //Car의 setGas메서드 호출
		
		boolean getState = myCar.isLeftGas();
		if (getState) {
			System.out.println("출발합니다");
			myCar.run();
		}
		
		if (myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
		}else {
			System.out.println("gas를 주입하세요");
		}
		
	}
}
