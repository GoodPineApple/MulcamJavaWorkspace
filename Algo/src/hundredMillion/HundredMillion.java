package hundredMillion;

import java.awt.List;

public class HundredMillion {
	public static void main(String[] args) {
		int originMoney = 100000000; // 원금 1억원
		double yearRate = 1.03; // 연이율 3%
		int duringMonth = 360; // 30년
		int mustDuringMonth = 12; // 거치기간 1년
		int[] monthOriginFee = new int[360]; // 30년동안 월에 갚는 원금
		int[] monthInterestFee = new int[360]; // 30년동안 월에 갚는 이자
		int[] firstYearOriginFee = new int[12]; // 첫 한해동안 값는 원금
		int[] firstYearInterestFee = new int[12]; // 첫 한해동안 값는 이자
		int[] afterYearOriginFee = new int[348]; // 29년동안 값는 원금
		int[] afterYearInterestFee = new int[348]; // 29년동안 값는 이자
		
//		$(document).ready(function(){
//	        //결과 계산
//	        //init 
//	        var loanMoney = 100000000; //원금
//	        var yearRate = 3.0; //연이자
//	        var repayPeriod = 30; //상환기간
//	        var mntTerm = 1; //거치기간
//
//	        //result var
//	        var monthPay = 0; //매월 갚는 금액
//	        var total = 0; //총비용
//	        var totalInterest = 0; //이자비용
//	        var monthInterest = 0; //월평균 이자액
//
//	        var n = repayPeriod * 12; //상환기간 - 개월
//	        var m = mntTerm * 12; //거치기간 - 개월
//	        var i = (yearRate/12) / 100; //1개월간 년 이율
//
//	        //상환기간 - 거치기간의 월 상환액
//	        var monthPaySub = loanMoney * ((i * Math.pow((1+i), (n - m))) / (Math.pow((1+i), (n - m)) - 1));
//
//	        //상환기간 - 거치기간의 총비용
//	        var totalSub = monthPaySub * (n - m);
//
//	        //상환기간 - 거치기간의 총이자
//	        var totalInterestSub = totalSub - loanMoney;
//
//	        //이자비용
//	        totalInterest = (totalInterestSub + ((i * loanMoney) * m));
//
//	        //총비용
//	        total = totalInterest + loanMoney;
//
//	        //월 상환액
//	        monthPay = total / n;
//
//	        //월 평균이자
//	        monthInterest = monthPay - (loanMoney / n);
//
//	        //result
//	        //원금
//	        $('#container').append('<div>결과</div>');
//
//	         $('#container').append('원금 : ' + loanMoney);
//	         $('#container').append('<br>');
//
//	         //총비용
//	         var totalResult = total;
//	         $('#container').append("총비용 : " + parseInt(totalResult));
//	         $('#container').append('<br>');
//
//	         //이자비용
//	         var totalInterestResult = totalResult - loanMoney;;
//	         $('#container').append("이자비용 : " + parseInt(totalInterestResult));
//	         $('#container').append('<br>');
//
//	         //월평균 이자
//	         var monthInterestResult = totalInterestResult / n;
//	         $('#container').append("월 평균 이자 : " + parseInt(monthInterestResult));
//	         $('#container').append('<br>');
//
//	         //매월 갚는 금액
//	         var monthPayResult = monthPay;
//	         $('#container').append("매월 갚는 금액 : " + parseInt(monthPayResult));
//	         $('#container').append('<br>');
		
	}

}
