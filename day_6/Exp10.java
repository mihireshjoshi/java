import java.util.Scanner;

interface RBI{
    void calInterest();
}
 
abstract class BankAccount {
    Scanner sc=new Scanner(System.in);
    int account,balance;
    String name,city;
    void input(){
        System.out.println("Enter account number");
        account=sc.nextInt();
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter balance");
        balance=sc.nextInt();
        System.out.println("Enter city");
        city=sc.next();

    }

    void display(){
        
        System.out.println("Account number: "+account+"\nName: "+name+"\nBalance: "+balance+"\nCity: "+city);
    }

    abstract void deposit();
    abstract void withdraw();

    
}


class Savings extends BankAccount implements RBI{
    
    void deposit(){
        System.out.println("Enter amount to add in savings");
        int deposit=sc.nextInt();
        super.balance=super.balance+deposit;
    }
    
    void withdraw(){
        System.out.println("Enter amount to withdra from savings");
        int withdraw=sc.nextInt();
        if(withdraw<super.balance){
            super.balance=super.balance-withdraw;
            System.out.println("new balance: "+super.balance);
        }
        else{
            System.out.println("Not enough amount");
        }
    }

    public void calInterest(){
        
        
    } 
}

class Current extends BankAccount implements RBI{
    
    void deposit(){
        System.out.println("Enter amount to add in savings");
        int deposit=sc.nextInt();
        super.balance=super.balance+deposit;
    }
    
    void withdraw(){
        System.out.println("Enter amount to withdraw from savings");
        int withdraw=sc.nextInt();
        if(withdraw<super.balance){
            super.balance=super.balance-withdraw;
            System.out.println("new balance: "+super.balance);
        }
        else{
            System.out.println("Not enough amount");
        }
    }

    public void calInterest(){

    }
}

class Bank {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Savings sav=new Savings();
        Current cur=new Current();
        

        int c1=0,c2=0,c3=0;

        while (c1!=5) {
            System.out.println("1.Create account\n2.Display Details\n3.Savings\n4.Current\n5.Exit\nEnter your choice:");
            c1=sc.nextInt();
            switch (c1) {
                case 1:
                    sav.input();
                    break;

                case 2:
                    sav.display();
                    break;
                
                case 3:
                    System.out.println("1.Deposit\n2.Withdraw\n3.Interest(currently under development)\nEnter your choice");
                    c2=sc.nextInt();
                    switch(c2){
                        case 1:
                            sav.deposit();
                            break;

                        case 2:
                            sav.withdraw();
                            break;

                        default:
                            System.out.println("Enter valid choice");
                    }
                    break;
                
                case 4:
                    System.out.println("1.Deposit\n2.Withdraw\n3.Interest(currently under development)\nEnter your choice");
                    c2=sc.nextInt();
                    switch(c2){
                        case 1:
                            cur.deposit();
                            break;

                        case 2:
                            cur.withdraw();
                            break;

                        default:
                            System.out.println("Enter valid choice");
                    }
                    break;
                    
                case 5:
                    System.out.println("see yaaa");
                    break;

                default:
                    System.out.println("Enter valid choic");
                    break;
            }
        }
    }
}
