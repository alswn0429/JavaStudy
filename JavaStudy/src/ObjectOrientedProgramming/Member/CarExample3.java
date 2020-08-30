package ObjectOrientedProgramming.Member;

/*
 * 인스턴스 멤버와 this
 */
public class CarExample3 {
	public static void main(String[] args) {
		Car3 myCar = new Car3("포르쉐");
		Car3 yourCar = new Car3("벤츠");
		
		myCar.run();
		yourCar.run();
	}
}
