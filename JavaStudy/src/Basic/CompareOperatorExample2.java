package Basic;

/*
 * 0.1 == 0.1f =>false
 * 0.1f는 0.1의 근사값으로 표현되어 0.10000000149의 값을 가짐
 * 따라서 0.1보다 크기 때문에 true값 반환
 * 해결책은 피연산자를 모두 같은타입으로 강제변환 후 비교연산자 이
 */
public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); 	//true
		
		double v4 = 0.1;
		double v5 = 0.1f;
		System.out.println(v4 == v5); 	//false
		System.out.println((float)v4 == v5);	//true
		System.out.println((int)(v4*10) == (int)(v5*10)); 	//true
	}
}
