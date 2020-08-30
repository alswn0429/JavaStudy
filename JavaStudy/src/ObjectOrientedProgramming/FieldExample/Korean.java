 ```java
package ObjectOrientedProgramming.FieldExample;

/*
 * 필드 초기화
 * 필드를 선언할 때 초기화하는 방법	: 클래스로부터 생성되는 모든 객체들은 같은 데이터를 가짐
 * 생성자에서 초기값을 주는 방법 : 외부에서 제공되는 다양한 값들로 초기화해야 될 때 사용
 */

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	int age;
	
	//생성자
	//필드와 동일한 이름을 갖는 매개변수로 쓰는게 관례
	//필드명 앞에 this.을 붙임!
	public Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
 ```
