package test03Answer;
 
import java.util.Scanner;
 
public class Test {
    public static void main(String[] args) {
        BankAccount[] customer_list = new BankAccount[100];
        Scanner input = new Scanner(System.in);
        String name,password, acNum;
        int initMoney;
        int i; // 고객목록에서 계좌번호 찾을때 쓰는 변수
         
        while (true) {
            System.out.println("\n -- 1:가입 2:입금 3:출금 4:계좌조회  -1:종료 -- ");
            System.out.print(" -- select >");
            int select = input.nextInt();
             
            if(select == -1)
                break;
             
            switch(select){
            case 1: // 가입
                int customer = BankAccount.getCustomerCount();
                input.nextLine(); // select 입력 후 남은 엔터키를 소진시킴
                System.out.print("이름:"); 
                name = input.nextLine();
                System.out.print("비밀번호:"); 
                password = input.nextLine();
                System.out.print("초기금액:"); 
                initMoney = input.nextInt();
                 
                customer_list[customer] = new BankAccount(name, password, initMoney);
                System.out.println("회원가입이 완료되었습니다.");
                customer_list[customer].printAccount();
                break;
            case 2: // 입금
                System.out.print("계좌번호를 입력하세요 : "); 
                input.nextLine();// select 입력 후 남은 엔터키를 소진시킴
                String ac_num = input.nextLine();
                boolean flag = false;
                for(i=0; i<customer_list.length; i++)
                {
                    if(customer_list[i]==null)
                        break;
                    else if(customer_list[i].getAccountNumber().equals(ac_num))
                    { // 해당 계좌번호가 존재하는 경우 실행되는 if
                        System.out.print("입금 금액:");
                        initMoney = input.nextInt();
                        customer_list[i].deposit(initMoney); // 입금 실행
                        System.out.println("입금이 완료되었습니다.");
                        flag = true;
                        break;
                    }
                }
                if(flag == false)
                    System.out.println("해당 계좌가 존재하지 않습니다.");
                 
                break;
            case 3: // 출금
                System.out.print("계좌번호를 입력하세요 : "); 
                input.nextLine();// select 입력 후 남은 엔터키를 소진시킴
                ac_num = input.nextLine();
                flag = false;
                for(i=0; i<customer_list.length; i++)
                {
                    if(customer_list[i]==null)
                        break;
                    else if(customer_list[i].getAccountNumber().equals(ac_num))
                    { // 해당 계좌번호가 존재하는 경우 실행되는 if
                        System.out.print("출금 금액:");
                        initMoney = input.nextInt();
                        input.nextLine();// select 입력 후 남은 엔터키를 소진시킴
                        System.out.print("비밀번호:");
                        password = input.nextLine();
                        if (customer_list[i].passwordCheck(password)){
                            customer_list[i].withdraw(initMoney); // 출금 실행
                            System.out.println("출금이 완료되었습니다.");
                        }else{
                            System.out.println("비밀번호가 틀려서 출금이 불가합니다.");
                        }
                        flag = true;
                        break;
                    }
                }
                if(flag == false)
                    System.out.println("해당 계좌가 존재하지 않습니다.");
                break;
            case 4: // 계좌 조회
                System.out.print("계좌번호를 입력하세요 : "); 
                input.nextLine();// select 입력 후 남은 엔터키를 소진시킴
                ac_num = input.nextLine();
                flag = false;
                for(i=0; i<customer_list.length; i++)
                {
                    if(customer_list[i]==null)
                        break;
                    else if(customer_list[i].getAccountNumber().equals(ac_num))
                    { // 해당 계좌번호가 존재하는 경우 실행되는 if
                        customer_list[i].printAccount();
                        flag = true;
                        break;
                    }
                }
                if(flag == false)
                    System.out.println("해당 계좌가 존재하지 않습니다.");
                break;
            default:
                System.out.println("입력이 잘못되었습니다."); 
            }
        }   
         
        System.out.println(" -- 프로그램이 종료되었습니다. byebye -- ");
 
    }
 
}
