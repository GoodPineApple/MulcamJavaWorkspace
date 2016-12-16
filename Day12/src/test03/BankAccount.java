package test03;
 
/*
 * ����       : ���� ���¸� �����ϰ�, �Ա� ����� ������ Ŭ����
 * �ۼ���  : ������
 * ���� ����    : 2014-4-15 
 */
 
public class BankAccount{
    private String ownerName;       // ���� ������ �̸�
    private String accountNumber;   // ���� ��ȣ
    private String password;        // ��й�ȣ(�������� ������ �ƴϹǷ� int ������� ����)
    private int balance;            // �ܾ� ����
     
    private static final int acNumSeed=11111; // ���¹�ȣ�� �ο��ϱ����� �⺻��
    private static int customerCount=0; // ȸ�� ��
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
    public void deposit(int money){  // �Ա� �޼ҵ�
    	balance += money;
    	System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
    }
    
    public void withdraw(int money){ // ��� �޼ҵ�
    	if(balance >= money) {
    		balance -= money;
    		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
    	} else {
    		System.out.println("�ܾ��� �����մϴ�.");
    	}
    	
    }
    // ��й�ȣ Ȯ�� �޼ҵ�
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
        System.out.println("***********���� ����**************");
        System.out.println("* ������ : "+ownerName);
        System.out.println("* ���¹�ȣ : "+accountNumber);
        System.out.println("* �ܾ� : "+balance);
        System.out.println("**********************************");
    }
 
}
