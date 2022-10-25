package bmicalculator;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        
      // Създаване на body mass index калкулатор(BMI). BMI калкулаторът пресмята вашият индекс по определена формула, спрямо теглото, което ще му подадете.
      //1. Създайте клас BMICalculator.
      //2. Създайте и имплементирайте метод  printIntroduction() – той ще се извиква всеки път при стартиране на програмата. Той ще трябва да информира потребителя 
      //какво прави програмата, която е пуснал.
      //3. Създайте метод getBMI(), който ще „поиска“ и ще „събере“ информация от потребителя за неговото тегло и височина. Нека да приема като аргумент Scanner, 
      //kg = lb / 2,2046). Нека за сега методът ви връща void.
      //4. Създайте метод bmiFor(), който по подадени тегло и височина, изчислява body mass index и го връща като резултат. Формулата за индекса е: 
      //weight/ (height2 .703).
      //5. Направете така, че методът getBMI() да връща като резултат, резултатът, който връща методът bmiFor().
      //6. Направете метод getStatus(). Той трябва да връща като резултат един от символните низове:  underweight, normal, overweight, obese. По статистики на център 
      //за здраве, тези 4 характеристики се дават съответно ако: индексът е не повече от 18,5, ако индексът е не повече от 25, ако индексът е не повече от 30 и ако е над 30.
      //7. Създайте метод ReportResults, който приема като параметри: пореден номер на резултата, BMI индекс, статус. Той трябва да изведе на конзолата подходящо 
      //съобщение, с което уведомява, че човекът с номер Х има BMI= х.х, закръглен до втория знак. За закръглянето изпозлвайте Math.round(BMI,2);
      //8. В main метод на програмата създайте Scanner, който чете от стандартен вход, подайте го към getBM(), после по върнатия от него резултат вземете статуса 
      //с метод getStatus() и извикайте метода reportResults(), за да изведете данните.

        Scanner console = new Scanner(System.in);
        printIntroduction();
        
        double bmi1 = getBmi(console);
        double bmi2 = getBmi(console);
        
        String status1 = getStatus(bmi1);
        String status2 = getStatus(bmi2);
        
        reportResults(1, bmi1, status1);
        reportResults(2, bmi2, status2);
        
        System.out.println("Difference = "+round(Math.abs(bmi1 - bmi2), 2));
        
    }
    public static void printIntroduction(){
        System.out.println("This program reads in data for two people and computes their body mass index (BMI)");
        System.out.println();
    }
    public static double getBmi(Scanner console){
        System.out.println("Please, enter your height in inches: ");
        double height = console.nextDouble();
        System.out.println("Please, enter your weight in pounds: ");
        double weight = console.nextDouble();   
        return bmiFor(height, weight);
    }
    public static double bmiFor(double height, double weight){
        return (weight*703/(height*height));
    }
    public static String getStatus(double bmi){
        if(bmi<18.5){
            return "underweight";
        }
        else if(bmi<25){
            return "normal";
        }
        else if(bmi<30){
            return "overweight";
        }
        else{
            return "obese";
        }
    }
    public static void reportResults(int person, double bmi, String status){
        System.out.println("Person "+person+" BMI = "+Math.round(bmi));
        System.out.println(status);
    }
    public static double round(double value, int digits){
        return Math.round(value * Math.pow(10, digits)) / Math.pow(10, digits);
    }
}
