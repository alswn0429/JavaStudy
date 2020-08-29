package Basic;

/*
 * System.arraycopy()를 이용한 배열복
 */
public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStringArray = {"java", "array" ,"copy"};
		String[] newStringArray = new String[5];
		
		//원본배열, 원본배열에서 복사할 항목의 시작인덱스, 새 배열, 새 배열에서 붙여넣을 인덱스, 복사할 개
		System.arraycopy(oldStringArray, 0, newStringArray, 0, oldStringArray.length);
		
		for (int i = 0; i < newStringArray.length; i++) {
			System.out.print(newStringArray[i] + ", ");
		}
	}
}
