package hundredMillion;

import java.awt.List;

public class HundredMillion {
	public static void main(String[] args) {
		int originMoney = 100000000; // ���� 1���
		double yearRate = 1.03; // ������ 3%
		int duringMonth = 360; // 30��
		int mustDuringMonth = 12; // ��ġ�Ⱓ 1��
		int[] monthOriginFee = new int[360]; // 30�⵿�� ���� ���� ����
		int[] monthInterestFee = new int[360]; // 30�⵿�� ���� ���� ����
		int[] firstYearOriginFee = new int[12]; // ù ���ص��� ���� ����
		int[] firstYearInterestFee = new int[12]; // ù ���ص��� ���� ����
		int[] afterYearOriginFee = new int[348]; // 29�⵿�� ���� ����
		int[] afterYearInterestFee = new int[348]; // 29�⵿�� ���� ����
		
//		$(document).ready(function(){
//	        //��� ���
//	        //init 
//	        var loanMoney = 100000000; //����
//	        var yearRate = 3.0; //������
//	        var repayPeriod = 30; //��ȯ�Ⱓ
//	        var mntTerm = 1; //��ġ�Ⱓ
//
//	        //result var
//	        var monthPay = 0; //�ſ� ���� �ݾ�
//	        var total = 0; //�Ѻ��
//	        var totalInterest = 0; //���ں��
//	        var monthInterest = 0; //����� ���ھ�
//
//	        var n = repayPeriod * 12; //��ȯ�Ⱓ - ����
//	        var m = mntTerm * 12; //��ġ�Ⱓ - ����
//	        var i = (yearRate/12) / 100; //1������ �� ����
//
//	        //��ȯ�Ⱓ - ��ġ�Ⱓ�� �� ��ȯ��
//	        var monthPaySub = loanMoney * ((i * Math.pow((1+i), (n - m))) / (Math.pow((1+i), (n - m)) - 1));
//
//	        //��ȯ�Ⱓ - ��ġ�Ⱓ�� �Ѻ��
//	        var totalSub = monthPaySub * (n - m);
//
//	        //��ȯ�Ⱓ - ��ġ�Ⱓ�� ������
//	        var totalInterestSub = totalSub - loanMoney;
//
//	        //���ں��
//	        totalInterest = (totalInterestSub + ((i * loanMoney) * m));
//
//	        //�Ѻ��
//	        total = totalInterest + loanMoney;
//
//	        //�� ��ȯ��
//	        monthPay = total / n;
//
//	        //�� �������
//	        monthInterest = monthPay - (loanMoney / n);
//
//	        //result
//	        //����
//	        $('#container').append('<div>���</div>');
//
//	         $('#container').append('���� : ' + loanMoney);
//	         $('#container').append('<br>');
//
//	         //�Ѻ��
//	         var totalResult = total;
//	         $('#container').append("�Ѻ�� : " + parseInt(totalResult));
//	         $('#container').append('<br>');
//
//	         //���ں��
//	         var totalInterestResult = totalResult - loanMoney;;
//	         $('#container').append("���ں�� : " + parseInt(totalInterestResult));
//	         $('#container').append('<br>');
//
//	         //����� ����
//	         var monthInterestResult = totalInterestResult / n;
//	         $('#container').append("�� ��� ���� : " + parseInt(monthInterestResult));
//	         $('#container').append('<br>');
//
//	         //�ſ� ���� �ݾ�
//	         var monthPayResult = monthPay;
//	         $('#container').append("�ſ� ���� �ݾ� : " + parseInt(monthPayResult));
//	         $('#container').append('<br>');
		
	}

}
