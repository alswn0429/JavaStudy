package inheritance.abstractClass;

//추상 클래스 선언!
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉰당!");
	}
	
	//추상메서드 선언!
	public abstract void sound();
}
