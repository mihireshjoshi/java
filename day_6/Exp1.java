/* 
 * Write a java program to create a clss known as Bank Account with methods inputdata, display, deposit and withdraw
 * Create a subclass called SavingsAccount and override withdraw
 */

import java.util.Scanner;

class BankAccount{
    Scanner sc = new Scanner(System.in);
    int account;
    long balance;
    String name;
    String city;
    long deposit;
    long withdraw;


    void input(){

        System.out.println("\n\nEnter acc no.");
        account=sc.nextInt();
        System.out.println("Your name");
        name=sc.next();
        System.out.println("Your balance");
        balance=sc.nextLong();
        System.out.println("Your city");
        city=sc.next();

    }

    void display(){
       
        System.out.println("\n\nAccount no.: "+account+"\nName: "+name+"\nAmount: "+balance+"\nCity: "+city);
        
    }

    void deposit(){

        System.out.println("Enter the amount to be deposited:");
        deposit=sc.nextLong();
        balance=balance+deposit;
        System.out.println("Balance: "+balance);

    }

    void withdraw(long withdraw){

        this.withdraw=withdraw;
        balance=balance-withdraw;
        System.out.println("Balance: "+balance);

        
    }
}


class SavingsAccount extends BankAccount{

    void withdraw(){

        System.out.println("\n\nEnter amount to withdraw:");
        withdraw=sc.nextLong();

        if(super.balance-withdraw>=1000){

            super.withdraw(withdraw);
        
        }
        else{

            System.out.println("Transaction not allowed\nYour current balance is: "+balance);
        
        }

    }

}


class Bank {
    
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        SavingsAccount ob = new SavingsAccount();
       
        int choice=0;
        while(choice!=5){

            System.out.println("\n\nEnter choice:\n1.Input\n2.Display\n3.Deposit\n4.Withdraw\n5.Exit");
            choice=sc.nextInt();
            
            switch (choice) {

                case 1:
                    ob.input();
                    break;

                case 2:
                    ob.display();
                    break;
                
                case 3:
                    ob.deposit();
                    break;

                case 4:
                    ob.withdraw();
                    break;

                case 5:
                    System.out.println("\nbyeee!!\n\n");
                    break;
            
                default:
                    System.out.println("\nEnter valid value\n\n");
                    break;

            }

        }
    }

    
}