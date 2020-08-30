package ObjectOrientedProgramming.Member;

/*
 * 정적 초기화 블록
 */
public class Television {
	static String company = "Samsung";
	static String model = "LDC";
	//초기화 하지 않음!
	static String info;
	
	//초기화블록
	static {
		info = company + "-" + model;
	}
}
