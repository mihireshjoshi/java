import java.util.ArrayList;

class Al {
    public static void main(String[] args) {
        
        ArrayList al1=new ArrayList<>();
        al1.add(89);
        al1.add("hello");
        al1.add("thala");
        al1.add(7.5);
        al1.add('m');
        al1.add(89);
        System.out.println("\nInitial list al1: "+al1);

        al1.remove(3);
        System.out.println("\nAfter removal: "+al1);
        
        System.out.println("\nThala is present at: "+(1+al1.indexOf("thala")));

        ArrayList<String> color=new ArrayList<>();
        color.add("black");
        color.add("blue");
        color.add("orange");
        System.out.println("\nColor array is: "+color);

        ArrayList<String> sample=new ArrayList<>();
        sample.add("yellow");
        sample.add("red");
        System.out.println("\nNew array is: "+sample);

        color.addAll(sample);
        System.out.println("\nFinal color array is: ");
        for(int i=0; i<5; i++){
            System.out.println(color.get(i).toString());
        }
        System.out.println("\n");

    }
}
