package Basic;

/*
 * 배열은 한 번 생성하면 크기를 변경할 수 없음
 * 따라서 더 많은 저장공간이 필요하면 보다 큰 배열을 새로 만들
 * 이전 배열로부터 항목 값들을 복사해야함
 * for문 이나 System.arraycopy() 메서드 사용
 */
public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}
}
