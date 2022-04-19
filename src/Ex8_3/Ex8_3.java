package Ex8_3;

public class Ex8_3 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 에러
			System.out.println(4); // 출력x
		} catch (Exception e) {
			System.out.println(5); //에러가 나면 출력
		}
		System.out.println(6);
	}
	

}
