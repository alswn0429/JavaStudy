package inheritance.abstractClass;

public class Cat extends Animal {
	
	public Cat() {
		this.kind = "포유류";
	}
	
	//추상메서드 재정의
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("냥냥!");
	}

}
