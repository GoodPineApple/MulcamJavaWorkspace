
package test03;
 
import java.util.Scanner;
 
public class Test {
    public static void main(String[] args) {
        BankAccount[] customer_list = new BankAccount[100];
        Scanner Input = new Scanner(System.in);
         
        while (true) {
            System.out.println("\n -- 1:가입 2:입금 3:출금 4:계좌조회  -1:종료 -- ");
            System.out.print(" -- select >");
            int select = Input.nextInt();
             
            if(select == -1)
                break;
             
            int count = 0;
            switch(select){
            case 1: // 가입
            	 System.out.print("이름:");
            	 String name = Input.next();
            	 
            	 System.out.print("비밀번호:");
            	 String pw = Input.next();
            	 
            	 System.out.print("초기금액:");
            	 int init_money = Input.nextInt();

            	 customer_list[count] = new BankAccount(name, pw, init_money); 
            	 System.out.println("회원가입완료");
            	 customer_list[count].printAccount();
            	 count++;
            	 
                break;
                
            case 2: // 입금
            	System.out.print("계좌번호를 입력하세요.");
            	int compare = Input.nextInt();
            	System.out.print("입금 금액:");
            	int money = Input.nextInt();
            	int i;
            	for( i= 0; i < count; i++) {
            		if(compare == 11111 + i) {
            			break;
            		} 
            	}
            	if(i==count){
            		customer_list[i].deposit(money);
            		customer_list[i].printAccount();
            	}else{
            		System.out.println("확인되지 않는 계좌번호입니다.");
            	}
                break;
            case 3: // 출금
            	System.out.print("계좌번호를 입력하세요.");
            	compare = Input.nextInt();
            	System.out.println("출금 금액:");
            	money = Input.nextInt();
            	
            	for( i= 0; i < count; i++) {
            		if(compare == 11111 + i) {
            			break;
            		} 
            	}
            	if(i==count){
            		i = 0;
                	for( int j= 0; j < count; j++) {
                		if(compare == 11111 + j) {
                			break;
                		} 
                	}
                	if(i==count){
                		System.out.println("비밀번호를 입력하세요.");
                		String userPw = Input.next();
                		if (customer_list[i].getPassword().equals(userPw)) {
                			customer_list[i].withdraw(money);
                			customer_list[i].printAccount();
                		} else {
                			System.out.println("부적절한 비밀번호입니다.");
                		}
                	}else{
                		System.out.println("확인되지 않는 계좌번호입니다.");
                	}
            	}else{
            		System.out.println("확인되지 않는 계좌번호입니다.");
            	}
                break;
            	
            	
            	 
            	
            
            case 4: // 계좌 조회
            	System.out.print("계좌번호를 입력하세요.");
            	compare = Input.nextInt();

            	for( i= 0; i < count; i++) {
            		if(compare == 11111 + i) {
            			break;
            		} 
            	}
            	if(i==count){
            		i = 0;
            		for( int j= 0; j < count; j++) {
            			if(compare == 11111 + j) {
            				break;
            			} 
            		}
            		if(i==count){
            			System.out.println("비밀번호를 입력하세요.");
            			String userPw = Input.next();
            			if (customer_list[i].getPassword().equals(userPw)) {
            				customer_list[i].printAccount();
            			} else {
            				System.out.println("부적절한 비밀번호입니다.");
            			}
            		}else{
            			System.out.println("확인되지 않는 계좌번호입니다.");
            		} 

            	}else{
            		System.out.println("확인되지 않는 계좌번호입니다.");
            	}
            	
                break;
            default:
                System.out.println("입력이 잘못되었습니다."); 
            }
        }   
         
        System.out.println(" -- 프로그램이 종료되었습니다. byebye -- ");
 
    }
 
}
 