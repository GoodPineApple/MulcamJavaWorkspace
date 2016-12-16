package test01;

// VO, DTO, Bean으로 불리는 형태의 클라스

// 에러 정보를 하나의 객체에 담아서 전달하거나 지정할 때 사용함.
// 아래는 책 1권에 대한 정보 5가지를 하나의 객체에 저장할 수 있도록 클래스 설계함.
public class BookVO {
	private int bookid;
	private String tilte;
	private String publisher;
	private String year;
	private int price;

	/////////////////////////////////////////////////////
	public BookVO() {
	}

	public BookVO(int bookid, String tilte, String publisher, String year, int price) {
		super();
		this.bookid = bookid;
		this.tilte = tilte;
		this.publisher = publisher;
		this.year = year;
		this.price = price;
	}

	public BookVO(String tilte, String publisher, String year, int price) {
		super();
		this.tilte = tilte;
		this.publisher = publisher;
		this.year = year;
		this.price = price;
	}
	
	public BookVO(int bookid,String year, int price) {
		super();
		this.bookid = bookid;
		this.year = year;
		this.price = price;
	}

	/////////////////////////////////////////////////
	@Override
	public String toString() {
		return "스티링";
	}

	////////////////////////////////////////////////
	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTilte() {
		return tilte;
	}

	public void setTilte(String tilte) {
		this.tilte = tilte;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
