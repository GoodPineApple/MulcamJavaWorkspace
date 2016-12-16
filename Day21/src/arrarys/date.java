package arrarys;

import java.util.Date;

public class date {
	public static void main(String[] args) {
		

		Date d = new Date( ); //현재 날짜로 Date 객체가 생성 
		System.out.println(d);
		
		//get에 라인 들어가는 건, 새로운 자바버전에선 더 이상 사용하지 않는다는 의미
		System.out.println(1900+d.getYear()); //객체로부터 연,월,일 출력!
		System.out.println(d.getMonth());
		System.out.println(d.getDate());
		
		d.setHours(12);
		d.setMinutes(34);
		d.setSeconds(0);
		System.out.println(d);
		
		
	}

}
