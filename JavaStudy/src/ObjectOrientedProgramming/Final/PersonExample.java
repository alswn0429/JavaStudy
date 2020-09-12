package ObjectOrientedProgramming.Final;

/*
 * final필드 테스트
 */
public class PersonExample {
	public static void main(String[] args) {
		Person p1 =  new Person("123456-123467", "봉구");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//final필드는 값 수정 불가!
		
	}
}
