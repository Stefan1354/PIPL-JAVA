package jbtnakov2;
import java.math.BigInteger;
import java.util.Scanner;
public class JBTNakov2 {
    public static void main(String[] args) {

//For loop
//1. Write a program, which sums the numbers 1...n.
//   5 -> 1 + 2 + 3 + 4 + 5 = 15

      Scanner s = new Scanner(System.in);
      System.out.println("Enter number: ");
      int a = s.nextInt();
      long sum = 0;
      
      for(int i=1; i<=a; i++){
          sum+=i;
          System.out.print(i);
          if(i<a)
              System.out.print("+");
      }
          System.out.println("="+sum);

//2. Write a program to sum given N numbers:
//     - Read n - the count of numbers to sum
//     - Read n floating-point numbers and print their sum
//     3
//     10
//     20   => 60
//     30   


   Scanner s = new Scanner(System.in);
   System.out.println("How many numbers you want? ");
   int a = s.nextInt();
   double sum = 0;
   
   for(int i=0; i<a; i++){
       double number = s.nextDouble();
       sum+=number;
   }
   System.out.println("Sum is: "+sum);
}
 
// In Java, we can iterate over characters

  for(char x ='a'; x<='z';x++){
      System.out.printf(x+ " ");
      System.out.println((int)x);
   }

// Convert ASCII / Unicode number to char

    char ch = (char) 65;
    System.out.println(ch);
   
//3. Write a program to print the Latin letters in certain range:
//    - read 2 letters, each on sepparate line
//    - print all leters in the specified range inclusively

//  a
//     =>  a b c
//  c

   Scanner s = new Scanner(System.in);
   char startLetter = s.nextLine().charAt(0);
   char endLetter = s.nextLine().charAt(0);
   
   for(char letter = startLetter; letter <= endLetter; letter++){
       System.out.println(letter+ " ");
   }

// Infinite loop
   for(; ; ){
       System.out.println("Infinite");
   }

   Scanner s = new Scanner(System.in);
   for(; ;){
       String name = s.nextLine();
       System.out.println("Hello, " +name+"!");
       
       if(name.equals("End"))
           break;
   }

//4. Write a program to continuously read integers from the console and print their sum until 0 is entered.

   Scanner s = new Scanner(System.in);
   int sum = 0;
   System.out.println("Enter numbers: ");

   
   for(; ;){
       int a = s.nextInt();
       sum+=a;
       
       if(a==0)
           break;
   }
   System.out.println("Sum is: "+sum);

//5. Write a program to calculate n^p.
// 2
//   => 32
// 5

   Scanner s = new Scanner(System.in);
   double n = s.nextDouble();
   int p = s.nextInt();
   double result = 1;
   
   for(int i=0; i<p; i++){
       result = result * n;
   }
   System.out.println(result);

// n*n*n*n*...*n --> p times
// p == 0 --> 1
// p == 1 --> n
// p == 2 --> n*n
// etc...

//6. Write a program to find the biggest and the smallest among given n number:

//4
    
//3
//1
//-5
//2
//The biggest number is 3.
//The smallest number is -5.

   Scanner s = new Scanner(System.in);
   System.out.println("How many numbers? ");
   int a = s.nextInt();
   double biggestNum = -999999;
   double smallestNum = Double.POSITIVE_INFINITY;
   double biggestNum = Double.NEGATIVE_INFINITY;
   System.out.println("Enter numbers: ");

   
   for(int i=0; i<a; i++){
       double num = s.nextDouble();
       if(num > biggestNum)
           biggestNum = num;
       if(num < smallestNum)
           smallestNum = num;
   }
   System.out.println("Biggest number is: "+biggestNum);
   System.out.println("Smallest number is: "+smallestNum);

//7. Write a program to sum n vowels, according to the table below:

//   character  a   e   i   o   u
//   value      1   2   3   4   5

//Read and integer n: the count of characters
//Read n characters and for each vowel adds its value to the result.

// 3
// i
// x    => 8
// u

//2
//a   => 1
//g

   Scanner s = new Scanner(System.in);
   int n = Integer.parseInt(s.nextLine());
   int sum = 0;
   for(int i=0; i<n; i++){
       char letter = s.nextLine().charAt(0);
       if(letter=='a')
           sum+=1;
       if(letter=='e')
           sum+=2;
       if(letter=='i')
           sum+=3;
       if(letter=='o')
           sum+=4;
       if(letter=='u')
           sum+=5;
   }
   System.out.println(sum);
   

//While loop

//8. Write a program to read a number in the range[1...100]:
//    - read a number from the console
//    - check if the number is in the range[1...100]
//        -no -> read a new number
//        -yes -> print the number and the program stops

Scanner s = new Scanner(System.in);
System.out.println("Enter n: ");
int n = s.nextInt();

while(n<1 || n>100){
   System.out.println("Invalid number. Try again.");
   n = s.nextInt();    
}
System.out.println("Valid number");

//9. Write a program to sum the digits of given number.
//   5634 -> 5 + 6 + 3 + 4 -> 18
//    8   -> 8

Scanner s = new Scanner(System.in);
System.out.println("Enter number: ");
int number = Math.abs(s.nextInt());
int sum = 0;

while(number>0){
   int lastDigit = number % 10;    //Take the last digit
   sum+=lastDigit;
   number = number / 10;           //Delete the last digit
}
System.out.println("Sum: "+sum);

Scanner s = new Scanner(System.in);
System.out.println("Enter book name: ");
String name = s.nextLine();

while(!name.equals("Alhemicar")){
   System.out.println("Wrong! Try again!");
   name = s.nextLine();
}
System.out.println("Book found!");
    

//10. Write a program to find the min and max numbers
//    read integers from the console until "END" is entered
//    print the biggest and the smallest integer.

   Scanner s = new Scanner(System.in);
   System.out.println("Enter numbers: ");
   
   int min = Integer.MAX_VALUE;
   int max = Integer.MIN_VALUE;
   
   while(true){
       String nextLine = s.nextLine();
       if(nextLine.equals("END"))
           break;
       int num = Integer.parseInt(nextLine);
       if(num > max)
           max = num;
       if(num < min)
           min = num;
   }
   System.out.println("Max num: "+max);
   System.out.println("Min num: "+min);
    

//11. Write a program to check if given number is special:
//    - special numbers are divisible by all of their digits without remainder
//    - read an integer and check whether it is a special number
//    - print "{num} is special" if the number is special
//    - otherwise, print "{num} is not special".

//23  -> 23 is not special
//204 -> 204 is special number

   Scanner s = new Scanner(System.in);
   int originalNum = s.nextInt();
   int num = Math.abs(originalNum);
   boolean isSpecial = true;
   
   while(num > 0){
       int lastDigit = num % 10;
       num = num / 10;
       if(lastDigit!=0 && originalNum % lastDigit != 0){
           isSpecial = false;
           break;
       }
   }
   if(isSpecial)
       System.out.println(originalNum+" is special");
   else
       System.out.println(originalNum+" is NOT special");

//Nested loops 

Scanner s = new Scanner(System.in);
System.out.println("Enter n: ");
int n = s.nextInt();

for(int i=1; i<n; i+=3){
   if(i>1)
       System.out.print(", ");
   System.out.print(i);

}
System.out.println();
    

//12. Write a program to print the even powers of 2:
//    - read a number n 
//    - print the even powers of 2 up to 2^n:
//          2^0, 2^2, 2^4, 2^6, ..., 2^n

//    10 -> 1, 4, 16, ..., 1024
//    7  -> 1, 4, 16, ..., 64

   Scanner s = new Scanner(System.in);
   int n = s.nextInt();
   long p = 1;    //2^0 = 1
   
   for(int i = 0; i<=n; i+=2){
       System.out.println(p);
       p = p * 2 * 2;
   }

//Second way

   Scanner s = new Scanner(System.in);
   int n = s.nextInt();
   BigInteger p = BigInteger.valueOf(1);
   for(int i=0; i<=n; i+=2){
       System.out.println(p);
       p = p.multiply(BigInteger.valueOf(4));
   }

//do while loop

    int num = 1;
    do{
        System.out.println(num);
        num*=2;
    }
    while
       (num<=1024);


   int n = 3;
   for(int i=1; i<=n; i++){
       for(int j=1; j<=n; j++){
           System.out.print(" *");
       }
   System.out.println();   //new line
   }

   int n = 5;
   for(int row = 1; row<=n; row++){
       System.out.print("row "+row+": ");
       for(int col = 1; col<=n; col++){
           System.out.print(" "+col);
       }
   System.out.println();
  }

   int n = 3;
   for(int floor=1; floor<=n; floor++){
       for(int row=1; row<=n;row++){
           for(int col=1; col<=n; col++){
               System.out.println(floor +" "+row+ " "+col);
           }
       }
   }


   Scanner s = new Scanner(System.in);
   int size = s.nextInt();
   for(int row=1; row<=size; row++){
       for(int col=1; col<=row; col++){
           System.out.print("*");
       }
       System.out.println();
   }

//nested while loops

int row = 1;
while(row<=2){
   System.out.printf("Row: %d%n", row);
   int col = 1;
   while(col<=3){
       System.out.printf(" Column: %d%n", col);
       col++;
   }
   row++;
}

   Scanner s = new Scanner(System.in);
   int n = s.nextInt();
   int line = 1;
   
   while(line<=n){
       int stars = line;
       while(stars>0){
           System.out.print("*");
           stars--;
       }
       System.out.println();
       line++;
   }
    

// 13. Sum of digits calculator
//Continuously read integers untlil "End" is entered
//Print the sum of digits for each integer
//Finally, print "Goodbye"

   Scanner s = new Scanner(System.in); 
   while(true){
       String input = s.nextLine();
       if(input.equals("End"))
           break;
       int num = Math.abs(Integer.parseInt(input));
       int sumOfDigits = 0;
       while(num>0){
           sumOfDigits += num % 10;
           num = num / 10;
       }
       System.out.println("Sum of digits: "+sumOfDigits);
   }
   System.out.println("Goodbye");
    

// 14. Magic Numbers

//Write a program to find all 3-digit magic numbers of order n.
//A number is magic of order n if the product of its digits is n


// 1 --> 111

//3  --> 113  131  311

   Scanner s = new Scanner(System.in);
   int n = s.nextInt();
   
   for(int firstDigit = 1; firstDigit<=9; firstDigit++){
       for(int secondDigit = 0; secondDigit<=9; secondDigit++){
           for(int thirdDigit = 0; thirdDigit<=9; thirdDigit++){
               if(firstDigit * secondDigit * thirdDigit == n)
                   System.out.printf("%d%d%d\n", firstDigit, secondDigit, thirdDigit);
           }
       }
   }
    

// 15. Calculate the money collection for multiple travel destinations:
//     Read destination and needed budget for destination.
//     Read many times amounts of collected money, until they are enough for the destination (starting from 0)
//     Print "Collected: {sum}" where sum is formatted to 2nd digit or "Going to {destination}"
//     Read another destination and budget and collect money again
//     A destination "End" ends the program.

   Scanner s = new Scanner(System.in);
   while(true){
       String destination = s.nextLine();
       if(destination.equals("End"))
           break;
       
       double budget = Double.parseDouble(s.nextLine());
       double collectedSum = 0;
       while(collectedSum < budget){
           double savedAmount = Double.parseDouble(s.nextLine());
           collectedSum += savedAmount;
           System.out.printf("Collected: %.2f\n", collectedSum);
       }
       System.out.println("Going to: "+destination);
   }


//16. Write a program to print all prime numbers in given range.

// 5
//     --> 5 7 11 13 17 19 23 27 29 31 37 41 43 47
// 50  
//
   Scanner s = new Scanner(System.in);
   int startNum = s.nextInt();
   int endNum = s.nextInt();
   
   for(int num = startNum; num<=endNum; num++){
       boolean isPrime = true;
       for(int divider = 2; divider<=Math.sqrt(num); divider++){
           // num = a * b --> a<=sqrt(num) or b<=sqrt(num)
           if(num % divider == 0){
               isPrime = false;
               break;
           }
       }
       if(isPrime)
           System.out.print(num + " ");

       
// 17. Write a program to generate PIN codes following certain rules
// Read 3 digits: max1, max2, max3(each is an upper limit)
// Generate unique 3-digit PIN codes, matching the following:
//     Each digit is withing its range: [1..max1], [1..max2], [1..max3]
//     The first and the third digit must be even
//     The second digit must be a prime number in the range [2..7]
//Print the PIN codes in increasing order

//      222
//      224
//3     232
//5 =>  234
//5     252
//      254

   Scanner s = new Scanner(System.in);
   int max1 = s.nextInt();
   int max2 = s.nextInt();
   int max3 = s.nextInt();
   
   for(int d1 = 2; d1 <= max1; d1+=2){
       for(int d2 = 2; d2 <= max2; d2++){
           if(d2==2 || d2==3 || d2==5 || d2==7){
               
               for(int d3 = 2; d3 <= max3; d3+=2)
                   System.out.println("" +d1 +d2 +d3);
           }
       }
   }
       

// 18. Write a program to generate all 4-digit happy numbers {d1}{d2}{d3}{d4} for given integer n:
//     A number is happy if  d1 + d2 == d3 + d4 == n


// 3   =>  1203  1212  1221  1230  2103  2112  2121  2130  3003  3012  3021  3030

    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    
    for(int d1=1; d1<=9; d1++){
        for(int d2=0; d2<=9; d2++){
            if(d1 + d2 == n){
                for(int d3 = 0; d3<=9; d3++){
                    for(int d4 = 0; d4<=9; d4++){
                        if(d3 + d4 == n)
                            System.out.println("" +d1 +d2 +d3 +d4+"");
                    }
                }
            }
        }
    }
}
}
