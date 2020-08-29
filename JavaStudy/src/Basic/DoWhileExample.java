package Basic;

import java.util.Scanner;

/*
 * while문은 시작할때부터 조건식을 검사하여 블록 내부를 실행할 지 결정
 * do-while문은 블록 내부에 실행문을 먼저 실행하고 실행 결과에 따라 반복실행의 여부 결정
 * 1. 실행문 실행 -> 2. 조건식 평가 
 */
public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		//Scanner객체 생성 
		Scanner scanner = new Scanner(System.in);
		//nextLine()메서드 호출
		String inputString;
		
		do {
			System.out.println(">");
			//키보드로 입력한 문자열 받음 
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));	//키보드 입력값이 q일때 논리연산자 값 바꿈 
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}
}
