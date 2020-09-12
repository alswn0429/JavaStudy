package ObjectOrientedProgramming.Final;

/*
 * final필드 선언과 초기화
 */
public class Person {
	//필드
	final String nation = "Korea";	//필드에서 초기화
	final String ssn;
	String name;
	
	//생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;	//생성자에서 초기화
		this.name = name;
	}
}
