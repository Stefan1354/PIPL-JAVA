package helloworld;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Unesite koliko puta zelite da se petlja ponovi?");
        a = s.nextInt();
        
        while(a>0)
        {
            System.out.println("Ovo je prolaz petlje broj: " +a);
            a--;
        }
    }
    
}
