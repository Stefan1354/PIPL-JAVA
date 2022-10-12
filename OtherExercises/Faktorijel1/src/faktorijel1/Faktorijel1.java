package faktorijel1;
import java.util.Scanner;
public class Faktorijel1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = s.nextInt();
        int faktorijel = 1;
        for(int i=1; i<=n; i++)
            faktorijel*=i;
        System.out.println("Faktorijel unetog broja je: " +faktorijel);
    }
}
