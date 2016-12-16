package metro;

public class MetroVO {

	private String stn;
	private int stnnum;
	private int stnline;
	private int duration;
	private boolean toilet;
	private boolean storage;
	private boolean otherside;
	private int otherStn;
	private int dijknum;
	private int closetransferstn1;
	private int closetransferstn2;

	public MetroVO() {

	}

	public MetroVO(String stn, int stnnum, int stnline, int duration, boolean toilet, boolean storage,
			boolean otherside, int otherStn, int dijknum, int closetransferstn1, int closetransferstn2) {
		super();
		this.stn = stn;
		this.stnnum = stnnum;
		this.stnline = stnline;
		this.duration = duration;
		this.toilet = toilet;
		this.storage = storage;
		this.otherside = otherside;
		this.otherStn = otherStn;
		this.dijknum = dijknum;
		this.closetransferstn1 = closetransferstn1;
		this.closetransferstn2 = closetransferstn2;
	}

	public MetroVO(String stn, int stnnum, int stnline, int duration, int otherStn, int dijknum, int closetransferstn1,
			int closetransferstn2) {
		super();
		this.stn = stn;
		this.stnnum = stnnum;
		this.stnline = stnline;
		this.duration = duration;
		this.otherStn = otherStn;
		this.dijknum = dijknum;
		this.closetransferstn1 = closetransferstn1;
		this.closetransferstn2 = closetransferstn2;
	}

	public MetroVO(String stn, int stnnum, int stnline, boolean toilet, boolean storage, boolean otherside) {
		super();
		this.stn = stn;
		this.stnnum = stnnum;
		this.stnline = stnline;
		this.toilet = toilet;
		this.storage = storage;
		this.otherside = otherside;
	}

	public String getStn() {
		return stn;
	}

	public void setStn(String stn) {
		this.stn = stn;
	}

	public int getStnnum() {
		return stnnum;
	}

	public void setStnnum(int stnnum) {
		this.stnnum = stnnum;
	}

	public int getStnline() {
		return stnline;
	}

	public void setStnline(int stnline) {
		this.stnline = stnline;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public boolean isToilet() {
		return toilet;
	}

	public void setToilet(boolean toilet) {
		this.toilet = toilet;
	}

	public boolean isStorage() {
		return storage;
	}

	public void setStorage(boolean storage) {
		this.storage = storage;
	}

	public boolean isOtherside() {
		return otherside;
	}

	public void setOtherside(boolean otherside) {
		this.otherside = otherside;
	}

	public int getOtherStn() {
		return otherStn;
	}

	public void setOtherStn(int otherStn) {
		this.otherStn = otherStn;
	}

	public int getDijknum() {
		return dijknum;
	}

	public void setDijknum(int dijknum) {
		this.dijknum = dijknum;
	}

	public int getClosetransferstn1() {
		return closetransferstn1;
	}

	public void setClosetransferstn1(int closetransferstn1) {
		this.closetransferstn1 = closetransferstn1;
	}

	public int getClosetransferstn2() {
		return closetransferstn2;
	}

	public void setClosetransferstn2(int closetransferstn2) {
		this.closetransferstn2 = closetransferstn2;
	}

	@Override
	public String toString() {
		return "MetroVO [stn=" + stn + ", stnnum=" + stnnum + ", stnline=" + stnline + ", duration=" + duration
				+ ", toilet=" + toilet + ", storage=" + storage + ", otherside=" + otherside + ", otherStn=" + otherStn
				+ ", dijknum=" + dijknum + ", closetransferstn1=" + closetransferstn1 + ", closetransferstn2="
				+ closetransferstn2 + "]";
	}

	public String toString2() {
		return stn + "¿ªÁ¤º¸:" + "stn=" + stn + ",toilet=" + toilet + ", storage=" + storage + ", otherside=" + otherside
				+ ", otherStn=" + otherStn + "";

	}

}