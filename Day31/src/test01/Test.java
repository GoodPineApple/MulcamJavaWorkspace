package test01;

import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		dao.createConnection();
		Scanner scan = new Scanner(System.in);
		
		String title,publisher,year;
		int bookId,price;
		
		BookVO book;
		List<BookVO> bookList;
		
		while(true) {
			System.out.println("1.책추가  2.책수정  3.책삭제  4.책조회  5.전체책목록  -1.종료");
			System.out.print("입력>>");
			int select = scan.nextInt();
			
			if(select == -1){
				break;
			}
			
			switch(select) {
			case 1: // 책 추가
				System.out.print("제목 : ");
				title = scan.next();
				System.out.print("출판사 : ");
				publisher = scan.next();
				System.out.print("출판년도 : ");
				year = scan.next();
				System.out.print("가격 : ");
				price = scan.nextInt();
				
				book = new BookVO(title, publisher, year, price);
				System.out.print("추가 결과: " + dao.insertBook(book));
				
				break;
			case 2: // 책 수정
				System.out.print("수정할 책 번호:");
				bookId = scan.nextInt();
				System.out.print("새로운 가격:");
				price = scan.nextInt();
				System.out.print("새로운 년도:");
				year = scan.next();
				
				book = new BookVO(bookId, year, price);
				System.out.print("수정 결과:" + dao.updateBook(book));
				break;
			case 3: // 책 삭제
				System.out.print("삭제할 책 번호");
				bookId = scan.nextInt();
				
				System.out.print("삭제 결과" + dao.deleteBook(bookId));
				break;
			case 4: // 책 조회
				System.out.print("검색할 책 번호 :");
				bookId = scan.nextInt();
				
				book = dao.selectBook(bookId);
				if(book == null) {
					System.out.print("해당 번호의 책이 없습니다.");
				} else {
					System.out.print(book);
				}
				break;
			case 5: // 모든 책 조회
				bookList = dao.selectBookList();
				
				if(bookList.size() == 0) {
					System.out.print("현재 등록된 책이 없습니다.");
				} else {
					for(BookVO b:bookList) {
						System.out.println(b);
					}
				}
				break;
			}
			
			
		}
		System.out.println("---도서관 프로그램 종료---");
	}

}
