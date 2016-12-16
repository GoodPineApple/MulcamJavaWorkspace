package test03;
 
/*
 * 개요       : 은행 계좌를 생성하고, 입금 출금이 가능한 클래스
 * 작성자  : 양유진
 * 개발 일자    : 2014-4-15 
 */
 
public class BankAccount{
    private String ownerName;       // 계좌 소유주 이름
    private String accountNumber;   // 계좌 번호
    private String password;        // 비밀번호(덧셈뺄셈 계산용이 아니므로 int 사용하지 않음)
    private int balance;            // 잔액 정보
     
    private static final int acNumSeed=11111; // 계좌번호를 부여하기위한 기본값
    private static int customerCount=0; // 회원 수
    public static int getCustomerCount(){
        return customerCount;
    }
    
     
    public BankAccount(String name, String pw, int init_money){
    	
    	this.ownerName = name;
    	this.accountNumber = acNumSeed + customerCount + " ";
    	this.password = pw;
    	this.balance = init_money;
    	customerCount++;
    	 
    }
    public void deposit(int money){  // 입금 메소드
    	balance += money;
    	System.out.println("입금이 완료되었습니다.");
    }
    
    public void withdraw(int money){ // 출금 메소드
    	if(balance >= money) {
    		balance -= money;
    		System.out.println("출금이 완료되었습니다.");
    	} else {
    		System.out.println("잔액이 부족합니다.");
    	}
    	
    }
    // 비밀번호 확인 메소드
    public boolean passwordCheck(String password){
        return (this.password.equals(password));
    }
//////getter/setter/////////////////////////////////////////////////////////////    
    public String getOwnerName() {
        return ownerName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
////////////////////////////////////////////////////////////////////////////////
    public void printAccount(){
        System.out.println("***********계좌 정보**************");
        System.out.println("* 소유주 : "+ownerName);
        System.out.println("* 계좌번호 : "+accountNumber);
        System.out.println("* 잔액 : "+balance);
        System.out.println("**********************************");
    }
 
}
