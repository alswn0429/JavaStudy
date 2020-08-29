package ObjectOrientedProgramming.Overloading;

/*
 * 생성자 오버로딩
 * 매개변수를 달리하는 생성자를 여러 개 선언!
 * 생성자가 오버로딩 되었을 경우, new 연산자로 생성자를 호출할 때 제공되는 매개값의 타입과 수에 의해 호출될 생성자 결정!
 */
public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	//기본 생성자
	Car() {
		
	}
	//model을 매개변수로 받는 생성자
	Car(String model) {
		this.model = model;
	}
	//model, color을 매개변수로 받는 생성자
	Car(String model, String color) {
		this.color = color;
		this.model = model;
	}
	//model, color, maxSpeed를 매개변수로 받는 생성자
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
