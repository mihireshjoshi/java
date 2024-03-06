
interface RBI{
    void accountCreation();
    void addMoney();
    void withdrawMoney();
    void checkBalance();
    void interestCal();
}

class SBI implements RBI{
    
    public void accountCreation() {
        
    }
    

    public void addMoney(){

    }


    public void withdrawMoney(){

    }


    public void checkBalance(){

    }


    public void interestCal(){

    }
}




class Axis implements RBI{
    
    public void accountCreation() {
        
    }
    

    public void addMoney(){

    }


    public void withdrawMoney(){

    }


    public void checkBalance(){

    }


    public void interestCal(){

    }
}



class HDFC implements RBI{
    
    public void accountCreation() {
         
    }
    

    public void addMoney(){

    }


    public void withdrawMoney(){

    }


    public void checkBalance(){

    }

    
    public void interestCal(){

    }
}



public class Exp4 {
    public static void main(String[] args) {
        RBI sbi=new SBI();
        RBI axis=new Axis();
        RBI hdfc=new HDFC();

    }
}
