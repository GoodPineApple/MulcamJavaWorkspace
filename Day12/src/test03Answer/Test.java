package test03Answer;
 
import java.util.Scanner;
 
public class Test {
    public static void main(String[] args) {
        BankAccount[] customer_list = new BankAccount[100];
        Scanner input = new Scanner(System.in);
        String name,password, acNum;
        int initMoney;
        int i; // ����Ͽ��� ���¹�ȣ ã���� ���� ����
         
        while (true) {
            System.out.println("\n -- 1:���� 2:�Ա� 3:��� 4:������ȸ  -1:���� -- ");
            System.out.print(" -- select >");
            int select = input.nextInt();
             
            if(select == -1)
                break;
             
            switch(select){
            case 1: // ����
                int customer = BankAccount.getCustomerCount();
                input.nextLine(); // select �Է� �� ���� ����Ű�� ������Ŵ
                System.out.print("�̸�:"); 
                name = input.nextLine();
                System.out.print("��й�ȣ:"); 
                password = input.nextLine();
                System.out.print("�ʱ�ݾ�:"); 
                initMoney = input.nextInt();
                 
                customer_list[customer] = new BankAccount(name, password, initMoney);
                System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
                customer_list[customer].printAccount();
                break;
            case 2: // �Ա�
                System.out.print("���¹�ȣ�� �Է��ϼ��� : "); 
                input.nextLine();// select �Է� �� ���� ����Ű�� ������Ŵ
                String ac_num = input.nextLine();
                boolean flag = false;
                for(i=0; i<customer_list.length; i++)
                {
                    if(customer_list[i]==null)
                        break;
                    else if(customer_list[i].getAccountNumber().equals(ac_num))
                    { // �ش� ���¹�ȣ�� �����ϴ� ��� ����Ǵ� if
                        System.out.print("�Ա� �ݾ�:");
                        initMoney = input.nextInt();
                        customer_list[i].deposit(initMoney); // �Ա� ����
                        System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
                        flag = true;
                        break;
                    }
                }
                if(flag == false)
                    System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
                 
                break;
            case 3: // ���
                System.out.print("���¹�ȣ�� �Է��ϼ��� : "); 
                input.nextLine();// select �Է� �� ���� ����Ű�� ������Ŵ
                ac_num = input.nextLine();
                flag = false;
                for(i=0; i<customer_list.length; i++)
                {
                    if(customer_list[i]==null)
                        break;
                    else if(customer_list[i].getAccountNumber().equals(ac_num))
                    { // �ش� ���¹�ȣ�� �����ϴ� ��� ����Ǵ� if
                        System.out.print("��� �ݾ�:");
                        initMoney = input.nextInt();
                        input.nextLine();// select �Է� �� ���� ����Ű�� ������Ŵ
                        System.out.print("��й�ȣ:");
                        password = input.nextLine();
                        if (customer_list[i].passwordCheck(password)){
                            customer_list[i].withdraw(initMoney); // ��� ����
                            System.out.println("����� �Ϸ�Ǿ����ϴ�.");
                        }else{
                            System.out.println("��й�ȣ�� Ʋ���� ����� �Ұ��մϴ�.");
                        }
                        flag = true;
                        break;
                    }
                }
                if(flag == false)
                    System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
                break;
            case 4: // ���� ��ȸ
                System.out.print("���¹�ȣ�� �Է��ϼ��� : "); 
                input.nextLine();// select �Է� �� ���� ����Ű�� ������Ŵ
                ac_num = input.nextLine();
                flag = false;
                for(i=0; i<customer_list.length; i++)
                {
                    if(customer_list[i]==null)
                        break;
                    else if(customer_list[i].getAccountNumber().equals(ac_num))
                    { // �ش� ���¹�ȣ�� �����ϴ� ��� ����Ǵ� if
                        customer_list[i].printAccount();
                        flag = true;
                        break;
                    }
                }
                if(flag == false)
                    System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
                break;
            default:
                System.out.println("�Է��� �߸��Ǿ����ϴ�."); 
            }
        }   
         
        System.out.println(" -- ���α׷��� ����Ǿ����ϴ�. byebye -- ");
 
    }
 
}
