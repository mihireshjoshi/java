class Main{
    public static void main(String[] args) {
        String a="Mihiresh";
        String b="ARif";
        String s1=a.toUpperCase();
        String s2=b.toLowerCase();
        char s3=a.charAt(5);
        int s4=b.indexOf('i');
        String s5=a.replace('i','j');
        System.out.println("String a is: "+a+"\nString b is: "+b+"\nString a in caps "+s1+"\nString b in small "+s2+"\nIn string a the characteer at sixth position is "+s3+"\nIn string b 'i' is present at "+(s4+1)+"\nNew String a is "+s5);
        if(a.equalsIgnoreCase(s1)){
            System.out.println("Same name "+a+" and "+s1);
        }
        

    }
}