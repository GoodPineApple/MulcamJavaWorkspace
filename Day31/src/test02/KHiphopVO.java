package test02;

public class KHiphopVO {
	private int num;
	private String title;
	private String singer;
	private int listenerpop;
	private String company;
/////////////////////////////////////////////////////////////////////////////////////////
	public KHiphopVO(int num, String title, String singer, int listenerpop, String company) {
		super();
		this.num = num;
		this.title = title;
		this.singer = singer;
		this.listenerpop = listenerpop;
		this.company = company;
	}
	public KHiphopVO(int num, String singer, int listenerpop, String company) {
		super();
		this.num = num;
		this.singer = singer;
		this.listenerpop = listenerpop;
		this.company = company;
	}
//////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "KHiphopVO [num=" + num + ", title=" + title + ", singer=" + singer + ", listenerpop=" + listenerpop
				+ ", company=" + company + "]";
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getListenerpop() {
		return listenerpop;
	}
	public void setListenerpop(int listenerpop) {
		this.listenerpop = listenerpop;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	
	
}
