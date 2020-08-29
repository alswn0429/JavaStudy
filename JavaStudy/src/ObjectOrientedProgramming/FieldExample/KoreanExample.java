package ObjectOrientedProgramming.FieldExample;

/*
 * 객체 생성 후 필드값 출력
 */
public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("멍멍멍", 13);
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.age : " + k1.age);
		
		Korean k2 = new Korean("냥냥냥", 9);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.age : " + k2.age);
	}
}
