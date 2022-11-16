import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Да се реализира клас StudentInfoScanner с метод "static String scanStudentInfo(Scanner).
        //Методът прочита 2 низа от клавиатурата:
        //1. Име - започва с главна буква, следвана от поне една малка. Буквите са на кирилица.
        //2. Факултетен номер - състои се от 9 цифри.
        //Потребителят въвежда даден низ отново, ако той не съвпадне с очаквания формат.
        //Проверката да се извършва с регулярен израз.
        //Връщаният стринг да е генериран чрез StringBuilder и да има следния вид:
        //"Hello, my name is: Име. My faculty number is: фак.номер."

        Scanner scanner = new Scanner(System.in);
        System.out.println(StudentInfoScanner.scanStudentInfo(scanner));
    }
}