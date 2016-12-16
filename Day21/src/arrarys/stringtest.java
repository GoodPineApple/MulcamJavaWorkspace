package arrarys;

import java.util.StringTokenizer;

public class stringtest {
	
	public static void main(String[] args) {
		
		String s = "a lot_ of_ sugar"; //문자열 객체 생성 
		
		StringTokenizer st = new StringTokenizer(s, "_"); //문자열 객체를 파편화
		//부분자 _ 기준으로 파편, _ 앞뒤로 글자를 파편화
		//boolean으로 삽입한 부분자로 파편화할지 결정 
		
		while(st.hasMoreTokens()){//모두 파편이 될 때까지 파편화
			System.out.println(st.nextToken());
		}
	}

}
