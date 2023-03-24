import java.util.StringTokenizer;

public class Stringtokenizer1 {
    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer("Hello i am dhiraj");
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
    }
}
