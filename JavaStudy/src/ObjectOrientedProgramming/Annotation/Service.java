package ObjectOrientedProgramming.Annotation;

public class Service {
	
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	//value값 *로 지정
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	//value값 #, 반복횟수=20
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
		
	}
}
