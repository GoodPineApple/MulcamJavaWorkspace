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
		return "å�� ������ " + title + "�̰�, �۰��� " + author + "�Դϴ�.";
	}
	
	void printbook() {
		System.out.println("å�� ������ " + title + "�̰�, �۰��� " + author + "�Դϴ�.");
	}

}
