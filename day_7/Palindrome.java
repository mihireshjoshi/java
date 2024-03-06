import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.next();
        char[] str1=str.toCharArray();
        int n=str1.length;
        String rev="";
        for(int i=n-1; i>=0; i--){
            rev=rev+str1[i];
            System.out.println(rev);
        }
        

        if(str.equalsIgnoreCase(rev)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a pallindrome");
        }
    }
}
