package test01;

// VO, DTO, Bean���� �Ҹ��� ������ Ŭ��

// ���� ������ �ϳ��� ��ü�� ��Ƽ� �����ϰų� ������ �� �����.
// �Ʒ��� å 1�ǿ� ���� ���� 5������ �ϳ��� ��ü�� ������ �� �ֵ��� Ŭ���� ������.
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
		return "��Ƽ��";
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
