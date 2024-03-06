public class Exp2 {
    public static void main(String[] args) {
        char[] ch= new char[]{'1','.','1','.','1','.','1'};
        String s=new String(ch);
        System.out.println(s);

        int flag=0;
        String a=new String(s);
        char[] sub=new char[s.length()+6];
        for(int x=0;x<s.length();x++){
            if(a.charAt(x)=='.'){
                sub[flag]='[';
                flag++;
                sub[flag]='.';
                flag++;
                sub[flag]=']';
                flag++;

            }
            else{
                sub[flag]=a.charAt(x);
                flag++;
            }
        }
        String neo=new String(sub);
        System.out.println(neo);
    }
}
