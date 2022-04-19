package objectArray;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		// 배열의 선언 : 공간만 생성 [5]개
//		Book[] book = new Book[5];
//		String[] strArray1 = { "태백산맥", "데미안", "어떻게 살 것인가", "토지", "어린왕자" };
//		String[] strArray2 = { "조정래", "헤르만 헷세", "유시민", "박경리", "생텍쥐베리" };

		ArrayList<Book> book = new ArrayList<Book>();

		book.add(new Book("태백산맥", "조정래"));
		book.add(new Book("데미안", "헤르만 헷세"));
		book.add(new Book("어떻게 살 것인가", "유시민"));
		book.add(new Book("토지", "박경리"));
		book.add(new Book("어린왕자", "생텍쥐베리"));

//		일반 for 문
		for (int i = 0; i < book.size(); i++) {
			Book b = book.get(i);
			b.showBookInfo();
		}
		System.out.println();
//		향상된 for 문
		for(Book b : book) {
			b.showBookInfo();
		}

		// 배열의 값을 저장
//		book[0] = new Book("태백산맥" , "조정래");
//		book[1] = new Book("데미안" , "헤르만 헷세");
//		book[2] = new Book("어떻게 살 것인가" , "유시민");
//		book[3] = new Book("토지" , "박경리");
//		book[4] = new Book("어린왕자" , "생텍쥐베리");

		// 배열에 값 출력
//		for (int i = 0; i < book.length; i++) {
//			System.out.println(book[i].getAuthor() + " " + book[i].getBookName());
//		}

//		for (String stra1 : strArray1) {
//			System.out.println(stra1);
//		}
//		for (String stra2 : strArray2) {
//			System.out.println(stra2);
//		}
	}
}
