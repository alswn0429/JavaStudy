package Basic;

/*
 * String으로 객체를 선언한 경우 동일한 힙영역에 만들어짐
 * 그러나 String x = new String();로 선언한 경우
 * 새로운 String객체의 번지값을 가지고 있음.
 */

public class StringEqualsExample {
	public static void main(String[] args) {
		String var1 = "히히히";
		String var2 = "히히히";
		String var3 = new String("히히히");
		
		System.out.println(var1 == var2);
		System.out.println(var2 == var3);
		System.out.println();
		System.out.println(var1.equals(var2));
		System.out.println(var1.equals(var3));
	}
}
