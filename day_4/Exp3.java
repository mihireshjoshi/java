import java.util.*;


public class Exp3 {

    int[] rn=new int[100];
    long[] mn=new long[100];
    String[] name=new String[100];
    String[] city=new String[100];
    int flag=0;
    public static void main(String[] args) {
        int choice=0;
        Scanner sc=new Scanner(System.in);
        Exp3 nb=new Exp3();
        while(choice!=5){
            System.out.println("\nEnter choice\n1.Input\n2.Display\n3.Update\n4.Delete");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    nb.inputItem();
                    break;
                case 2:
                    nb.display();
                    break;
                case 3:
                    nb.update();
                    break;
                case 4:
                    nb.delete();
                    break;
                case 5:
                    System.out.println("Tata, goodbye, gaya");
                default:
                    System.out.println("Enter valid input");

            }
        }
    }

    public void inputItem(){
        Scanner sc=new Scanner(System.in);
        Exp3 ob=new Exp3();
        System.out.println("Enter details:");
        System.out.println("Enter roll no.:");
        rn[flag]=sc.nextInt();
        System.out.println("Enter name:");
        name[flag]=sc.next();
        System.out.println("Enter mobile number:");
        mn[flag]=sc.nextLong();
        System.out.println("Enter city:");
        city[flag]=sc.next();
        
        flag++;
    }


    public void display(){
        Exp3 ob=new Exp3();
        int i=0;
        System.out.println("Name\t\tRoll no.\tMobile\t\tCity");
        while(i<flag){
            System.out.println(name[i]+"\t\t"+rn[i]+"\t\t "+mn[i]+"\t\t "+city[i]);
            i++;
        }
    }

    public void update(){
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.println("Enter roll no.:");
        int roll=sc.nextInt();
        while(i<=flag){
            if(rn[i]==roll){
                System.out.println("What do you wish to change:\n1.name\n2.mob\n3.city");
                int ch=sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("enter name");
                        name[i]=sc.next();
                        break;
                    case 2:
                        System.out.println("enter mobile");
                        mn[i]=sc.nextInt();
                    case 3:
                        System.out.println("enter city");
                        city[i]=sc.next();
                    default:
                        System.out.println("Enteer valid input");
                        break;
                }
            }
            i++;
        }
    }


    public void delete(){
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.println("Enter roll no.:");
        int roll=sc.nextInt();
        while(i<=flag){
            if(rn[i]==roll){
                int jawan=i;
                while(jawan<flag){
                    rn[jawan]=rn[jawan+1];
                    name[jawan]=name[jawan+1];
                    city[jawan]=city[jawan+1];
                    mn[jawan]=mn[jawan+1];
                    jawan++;
                }
            }
            
            i++;
        }
        flag--;
    }
}
