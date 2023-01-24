import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Да се прочете низ от конзолата с числа разделени със запетая ("1, 5, 10, 100");
        // Да се запише низ във файла.
        // Да се прочете съдържанието на файла.
        // Низът да се преобразува в масив от int. (String.split() и Integer.parseInt())
        // Използвайте BufferedWriter/Reader.

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("niki.txt"))) {
            bw.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("niki.txt"))) {
            String fromFile = br.readLine();
            String[] temp = fromFile.split(",");
            int[] nums = Arrays.stream(temp)
                    .mapToInt(Integer::parseInt).toArray();
            System.out.println("Nums from file: ");
            Arrays.stream(nums).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}