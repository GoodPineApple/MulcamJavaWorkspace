
package test03;
 
import java.util.Scanner;
 
public class Test {
    public static void main(String[] args) {
        BankAccount[] customer_list = new BankAccount[100];
        Scanner Input = new Scanner(System.in);
         
        while (true) {
            System.out.println("\n -- 1:���� 2:�Ա� 3:��� 4:������ȸ  -1:���� -- ");
            System.out.print(" -- select >");
            int select = Input.nextInt();
             
            if(select == -1)
                break;
             
            int count = 0;
            switch(select){
            case 1: // ����
            	 System.out.print("�̸�:");
            	 String name = Input.next();
            	 
            	 System.out.print("��й�ȣ:");
            	 String pw = Input.next();
            	 
            	 System.out.print("�ʱ�ݾ�:");
            	 int init_money = Input.nextInt();

            	 customer_list[count] = new BankAccount(name, pw, init_money); 
            	 System.out.println("ȸ�����ԿϷ�");
            	 customer_list[count].printAccount();
            	 count++;
            	 
                break;
                
            case 2: // �Ա�
            	System.out.print("���¹�ȣ�� �Է��ϼ���.");
            	int compare = Input.nextInt();
            	System.out.print("�Ա� �ݾ�:");
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
            		System.out.println("Ȯ�ε��� �ʴ� ���¹�ȣ�Դϴ�.");
            	}
                break;
            case 3: // ���
            	System.out.print("���¹�ȣ�� �Է��ϼ���.");
            	compare = Input.nextInt();
            	System.out.println("��� �ݾ�:");
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
                		System.out.println("��й�ȣ�� �Է��ϼ���.");
                		String userPw = Input.next();
                		if (customer_list[i].getPassword().equals(userPw)) {
                			customer_list[i].withdraw(money);
                			customer_list[i].printAccount();
                		} else {
                			System.out.println("�������� ��й�ȣ�Դϴ�.");
                		}
                	}else{
                		System.out.println("Ȯ�ε��� �ʴ� ���¹�ȣ�Դϴ�.");
                	}
            	}else{
            		System.out.println("Ȯ�ε��� �ʴ� ���¹�ȣ�Դϴ�.");
            	}
                break;
            	
            	
            	 
            	
            
            case 4: // ���� ��ȸ
            	System.out.print("���¹�ȣ�� �Է��ϼ���.");
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
            			System.out.println("��й�ȣ�� �Է��ϼ���.");
            			String userPw = Input.next();
            			if (customer_list[i].getPassword().equals(userPw)) {
            				customer_list[i].printAccount();
            			} else {
            				System.out.println("�������� ��й�ȣ�Դϴ�.");
            			}
            		}else{
            			System.out.println("Ȯ�ε��� �ʴ� ���¹�ȣ�Դϴ�.");
            		} 

            	}else{
            		System.out.println("Ȯ�ε��� �ʴ� ���¹�ȣ�Դϴ�.");
            	}
            	
                break;
            default:
                System.out.println("�Է��� �߸��Ǿ����ϴ�."); 
            }
        }   
         
        System.out.println(" -- ���α׷��� ����Ǿ����ϴ�. byebye -- ");
 
    }
 
}
 