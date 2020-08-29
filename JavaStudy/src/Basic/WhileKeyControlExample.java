package Basic;

import java.io.IOException;

/*
 * 키보드로 while문 제어
 */
public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		//Enter키가 입력되면 캐리지리턴(13)과 라인피드(10)가 입력되므로 이 값 제외
		while(run) {
			if(keyCode!=13 && keyCode!= 10) {
				System.out.println("--------------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("--------------------------------");
				System.out.println("선택: ");
			}
		
			//키보드의 키코드 읽음 
			keyCode = System.in.read();
			
			if (keyCode == 49) {	//1을 읽었을 경우
				speed++;
			} else if(keyCode == 50) { //2를 읽었을 경
				speed--;
				System.out.println("현재 속도 = " + speed );
			} else if(keyCode == 51) { 	//3을 읽었을 경
				//while문을 종료하기 위해 run 변수에 false를 저
				run = false;
			}
		}
	
		System.out.println("프로그램 종료");
	}
}
