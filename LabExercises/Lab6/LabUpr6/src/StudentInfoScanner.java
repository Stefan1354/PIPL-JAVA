import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class StudentInfoScanner {
    static Pattern pN = Pattern.compile("[А-Яа-я+]");
    static Pattern pF = Pattern.compile("[0-9]{9}");

    static String scanStudentInfo(Scanner scanner) {
        String studentName;
        String studentFacNo;
        Matcher mN;
        Matcher mF;
        do {
            System.out.println("Enter student name: ");
            studentName = scanner.next();
            System.out.println("Enter his faculty number: ");
            studentFacNo = scanner.next();
            mN = pN.matcher(studentName);
            mF = pF.matcher(studentFacNo);
        }
        while (mN.matches() == false && mF.matches() == false);
        String answerString = "Hello! My name is " + studentName + ". My faculty number is: " + studentFacNo;
        return answerString;
    }
}
