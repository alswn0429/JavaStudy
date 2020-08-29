package Basic.Enum;

import java.util.Calendar;

/*
 * 열거타입 변수 = 열거타입.열거상수; 로 사용 가능!
 * ex)Week today = Week.SUNDAY;
 */
public class EnumWeekExample {
	public static void main(String[] args) {
		//열거타입 변수 선
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);	//일(1) ~ 토(7)까지의 숫자 리턴
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("놀쟈!");
		} else {
			System.out.println("더 재밌게 놀쟈!");
		}
	}
}
