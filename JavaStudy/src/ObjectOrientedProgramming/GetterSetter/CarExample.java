package ObjectOrientedProgramming.GetterSetter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//올바른 속도 입력
		myCar.setSpeed(60);
		
		//멈춤
		//isStop() 리턴값이 false인 경우 자동차를 멈추기 위해서 setStop(true)를 호출
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
	}
}
