package inheritance.polymorphism;

//Tire의 자식클래스
public class KumhoTire extends Tire{
	//필드
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메서드 오버라이드
	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation-accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
	
	
}
