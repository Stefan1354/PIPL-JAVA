package bmicalculator;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
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