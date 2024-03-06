import java.util.*;

public class Stack {

    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Mention stack limit");
        int limit=sc.nextInt();
        int[] stack=new int[limit];
        int choice=0, top=-1;
        while(choice!=5){
            System.out.println("\n\n1.Push\n2.Pop\n3.Peek\n4.Traverse\n5.Exit\nEnter choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    if(top<limit){
                        top++;
                        System.out.println("Enter element to be pushed");
                        stack[top]=sc.nextInt();
                                    
                    }
                    else{
                        System.out.println("Stack overflow");
                    }
                    break;



                case 2:
                    if(top<0){
                        System.out.println("Stack empty");
                    }
                    else{
                                    
                        System.out.println(stack[top]);
                        top--;
                    }
                    break;



                case 3:
                    if(top>=0 && top<limit){
                        System.out.println(stack[top]);
                    }
                    else{
                        System.out.println("no top");
                    }
                    break;



                case 4: 
                    if(top>=0 && top<limit){
                        for(int i=0; i<=top; i++){
                            System.out.println("At position "+i+" is "+stack[i]);
                        }
                    }
                    else{
                        System.out.println("Stack not suitable for traversal");
                    }
                    break;



                case 5:
                    System.out.println("You choose to leave!!");
                    break;



                default:
                    System.out.println("Enter valid choice");
                    break;
                }
        }
        
    }

    
    
}
