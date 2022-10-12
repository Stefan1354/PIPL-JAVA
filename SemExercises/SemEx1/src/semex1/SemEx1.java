package semex1;
import java.util.Scanner;
public class SemEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Enter your faculty number: ");
        int number = s.nextInt();
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        System.out.println("Your name is "+name+", with faculty number "+number+" and you are "+age+" year old.");
        
    } 
}
