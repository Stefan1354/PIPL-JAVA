import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //1.Създайте проект myFirstProject. Създайте клас myFirstClass , в който има main() метод.
        //В main() метода да се прочетат име, години и рожденна дата на даден човек, въведени от клавиатурата,
        //чрез използване на класа Scanner. Данните да се отпечатат на стандартния изход.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        System.out.println("Enter date of birth: ");
        String date = s.next();
        System.out.println(name);
        System.out.println(age);
        System.out.println(date);


        //2. Напишете програма, която по зададени две страни на правоъгълник изчислява и отпечатва неговото лице.
        //Дължините на страните се въвеждат от стандартния вход.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side length of the rectangle: ");
        float length = s.nextFloat();
        System.out.println("Enter the side width of the rectangle: ");
        float width = s.nextFloat();
        float area = length * width;
        System.out.println("Area of rectangle is: "+Math.ceil(area));


        //3.  Напишете програма която получава от стандартния вход 5 низа, разделени с интервал и записва низовете в масив.
        //Отпечатва низовете на екрана.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter five strings seperated by a space: ");
        String strings = s.nextLine();
        String[] arr = strings.split(" ");
        System.out.println(Arrays.toString(arr));

    }
}