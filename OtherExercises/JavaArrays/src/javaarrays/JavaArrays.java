package javaarrays;
import java.util.Scanner;
public class JavaArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many elements do you want to input? ");
        int size = s.nextInt();
             
        int[] numbers = new int[size];
           
        System.out.println("Enter elements: ");
        for(int i=0; i<numbers.length; i++){
            numbers[i] = s.nextInt();   
        }
           
        System.out.println("The elements of array are: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        
        System.out.println("\nElements of array in descendig order: ");
        for(int i=numbers.length-1; i>=0; i--){
            System.out.print(numbers[i]+" ");
        }
        
        
        System.out.println("\nElements of array sorted in ascending order: ");
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int temp=0;
                if(numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for(int i=0; i<numbers.length; i++)
            System.out.print(numbers[i]+" ");
}
}
