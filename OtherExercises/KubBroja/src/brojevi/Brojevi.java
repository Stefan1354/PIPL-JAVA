package brojevi;
import java.util.Scanner;
public class Brojevi {

    public static int kub(int a){
        int kub = a*a*a;
        return kub;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite jedan ceo broj: ");
        int a = s.nextInt();
        System.out.println("Kub tog broja  je: " +kub(a));         
    }
}
