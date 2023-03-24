package phone;
public class FeturedPhone implements Phone {
    public boolean calling(){
        return true;
    }
    public boolean internet(){
        return false;
    }
    public static void main(String[] args) {
        FeturedPhone smc = new FeturedPhone();
        System.out.println("Feuture phone can call "+smc.calling()+" and internet is "+smc.internet()); 
    }
}
