package phone;
public class Smartphone implements Phone{
    public boolean calling(){
        return true;
    }
    public boolean internet(){
        return true;
    }
    public static void main(String[] args) {
        Smartphone sm = new Smartphone();
        System.out.println("Smartphone phone can call "+sm.calling()+" and internet is "+sm.internet()); 
    }
}
