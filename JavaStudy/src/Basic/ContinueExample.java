package Basic;

/*
 * continue문은 반복문에서만 사용
 * contnue문이 사용되면 for문의 증감식, while, do-while문의 조건식으로 이동
 * 특정 조건을 만족하는 경우에 continue문을 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어간다.
 */
public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			//2로 나눈 나머지가 0이 아닐 경우, 이후의 문장 실행하지 않음
			if (i %2 != 0) {
				continue;
			}
			
			System.out.println(i);
		}
	}
}
