package Basic;

/*
 * 향상된 for문은 배열 및 컬렉션 항목의 개수만큼 반복하고, 자동적으로 for문을 빠져나간다
 * for(2.타입 변수 : 1. 배열) {
 * 		3. 실행
 * }
 * for문이 처음 실행될때 1. 배열에서 가져올 첫번째 값이 존재하면
 * 해당 값을 2. 변수에 저장하고 나서
 * 3. 실행문을 실행한다
 * 만약 다음 항목이 존재하면 2 -> 3 -> 1 로 다시 진행
 * 가져올 다음 항목이 없으면 for문 빠져나감
 * 따라서 for문의 반복횟수는 배열의 항목 수!
 */
public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
}
