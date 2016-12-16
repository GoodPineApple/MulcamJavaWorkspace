package programming02;

public class Book {
	private String title, author;
	
	void setBook(String usertitle, String userauthor){
		title = usertitle;
		author = userauthor;
	}
	
	String getTitle(){
		return title;
	}
	
	String getAuthor(){
		return author;
	}
	
	public String toString(){
		return "책의 제목은 " + title + "이고, 작가는 " + author + "입니다.";
	}
	
	void printbook() {
		System.out.println("책의 제목은 " + title + "이고, 작가는 " + author + "입니다.");
	}

}
