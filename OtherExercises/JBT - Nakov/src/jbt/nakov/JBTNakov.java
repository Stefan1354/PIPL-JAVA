package jbt.nakov;
import java.util.Scanner;
public class JBTNakov {
    public static void main(String[] args) {
        
// Java Basic Tutorial - [1 - 6]  Code with Nakov

       int size = 5;
       int area = size * size;
       System.out.println("Size: "+size);
       System.out.println("Area: "+area);

//1.Program, which converts USD to EUR.
        
   Scanner s = new Scanner(System.in);
   System.out.println("Enter dollars: ");
   int dollars = s.nextInt();
   double euro = dollars * 0.88;
   System.out.println(dollars + " dollars = "+euro+ " euro");
        

//2. Program, which converts centimeters to inches.

   Scanner s = new Scanner(System.in);
   System.out.println("Enter centimeters: ");
   double centimeters = s.nextDouble();
   double inches = centimeters / 2.54;
   System.out.printf("%.2f cm = %.2f inches", centimeters, inches);

    String name = "John";
    int age = 19;
    System.out.printf("%s is %d year old. The next year, he will be %d year old", name, age, age+1);
    
    double a = 1.33;
    double b = 1.57;
    System.out.printf("The sum is %.2f\n", a+b);
        
    
//3.  Program, which converts days to minutes.

   Scanner s = new Scanner(System.in);
   System.out.println("Enter number of days: ");
   int days = s.nextInt();
   int minutes = days * 1440;
   System.out.printf(days + " days = "+minutes+ "minutes");
        

//4. Program, that calculate area of circle.
// C = 2*3.14*r

   Scanner s = new Scanner(System.in);
   System.out.println("Enter radius: ");
   float radius = s.nextFloat();
   float perimeter = (float) (2 * radius * 3.14);
   System.out.printf("Perimeter of circle with radius %.2f is %.2f\n", radius, perimeter);

   Scanner s = new Scanner(System.in);
   System.out.println("Unesite duzine stranica: ");
   int a = s.nextInt();
   int b = s.nextInt();
   int obim = 2 * (a + b);
   int povrsina = a * b;
   System.out.println("Obim pravougaonika je: "+obim);
   System.out.println("Povrsina pravougaonika je: "+povrsina);
        

//5. Write a program to calculate figure area, which:
//     - reads the type of the figure(String)
//     - reads the size of the figure(one or two int values)
//     - checks if the figure is square, rectangle or circle
//     - prints the calculated area, formatted to the 2nd decimal.

     Scanner s = new Scanner(System.in);
     System.out.println("Enter the type of figure: ");
     String figure = s.nextLine();
     
     
     if(figure.equals("square"))
     {
         System.out.println("Enter length of square: ");
         int a = s.nextInt();
         float area = a*a;
         System.out.printf("Area of square is: %.2f\n", +area);
     }
     
     else if(figure.equals("rectangle"))
     {
         System.out.println("Enter length of rectangle: ");
         int b = s.nextInt();
         System.out.println("Enter width of rectangle: ");
         int c = s.nextInt();
         float arearec = b * c;
         System.out.printf("Area of rectangle is: %.2f\n", +arearec);
     }
     
     else if(figure.equals("circle"))
     {
         System.out.println("Enter radius of circle: ");
         float r = s.nextInt();
         float areacir = (float) (r * r * Math.PI);
         System.out.printf("Area of circle is: %.2f\n", +areacir);
     }
     else{
         System.out.println("Invalid figure!!!");
     }
    

//6.  Write a program to calculate the price for a drink, which:
//    - reads a drink name: either "coffee" or "tea"
//    - reads an extra: either "sugar" or "no"
//    - prints the price in format "Final price: ${price}"
//    Prices:
//    - coffee - 1.00
//    - tea    - 0.60
//    - sugar  - 0.40

//First way

   Scanner s = new Scanner(System.in);
   System.out.println("Do you want coffee or tea? ");
   String drink = s.nextLine();
   
   if(drink.equals("coffee"))
   {
       System.out.println("Do you want sugar? ");
       String drink1 = s.nextLine();
       if(drink1.equals("yes")){
           System.out.println("You need to pay $1.40");
       }
       else
           System.out.println("You need to pay $1.00");
   }
   
   else if(drink.equals("tea"))
   {
       System.out.println("Do you want sugar? ");
       String drink2 = s.nextLine();
       if(drink2.equals("yes")){
           System.out.println("You need to pay $1.00");
       }
       else
           System.out.println("You need to pay $0.60");
   }
   else
       System.out.println("Invalid input");
    

//Second way 

    Scanner s = new Scanner(System.in);
    double price = 0;
    System.out.println("Do you want coffee or tea? ");
    var drinkType = s.nextLine();
    if(drinkType.equals("coffee")){
        price = 1.00;
    }
    
    else if(drinkType.equals("tea")){
        price = 0.60;
    }
    else{
        System.out.println("Invalid drink!");
        return;
   }
    
    var extra = s.nextLine();
    if(extra.equals("sugar")){
        price+=0.40;
   }
    else if(! extra.equals("no"))
    {
        System.out.println("Invalid extra!");
        return;
    }
    
    System.out.printf("Final price: $%.2f\n", price);


//7. Write a program to check whether a triangle is valid, which:
//    - reads 3 integers: the sides of a triangle
//    - checks if each side is lesser than the sum of the other 2
//    - prints "valid triangle" if the above condition is met
//    - prints "invalid triangle" otherwise.

// First way

   Scanner s = new Scanner(System.in);
   System.out.println("Enter a: ");
   int a = s.nextInt();
   System.out.println("Enter b: ");
   int b = s.nextInt();
   System.out.println("Enter c: ");
   int c = s.nextInt();
   
if(a+b<=c){
    System.out.println("Invalid triangle");
}
else if(a+c<=b){
    System.out.println("Invalid triangle");
}
else if(b+c<=a){
   System.out.println("Invalid triangle");
}
else
    System.out.println("Valid triangle");


//Second way

   Scanner s = new Scanner(System.in);
   System.out.println("Enter a: ");
   int a = s.nextInt();
   System.out.println("Enter b: ");
   int b = s.nextInt();
   System.out.println("Enter c: ");
   int c = s.nextInt();
   
   if(a+b<=c || a+c<=b || b+c<=a)
       System.out.println("Invalid figure");
   else
       System.out.println("Valid figure");

//Third way

   Scanner s = new Scanner(System.in);
   System.out.println("Enter a: ");
   int a = s.nextInt();
   System.out.println("Enter b: ");
   int b = s.nextInt();
   System.out.println("Enter c: ");
   int c = s.nextInt();
   
   boolean valid = true;
   if(a+b<=c)
       valid = false;
   else if(a+c<=b)
       valid = false;
   else if (b+c<=a)
       valid = false;
   
   if(valid)
       System.out.println("Valid triangle");
   else
       System.out.println("Invalid triangle");
    

//8.    Read a product and day from the console
//      Print the price, formatted to 2nd digit, based on the price table:
//
//      Product    Weekday    Weekend
//      Banana       2.50       2.70
//      Apple        1.30       1.60
//      Kiwi         2.20       3.00

   Scanner s = new Scanner(System.in);
   System.out.println("Enter product: ");
   var product = s.nextLine();
   System.out.println("Enter weekday or weekend: ");
   var daysOfWeek = s.nextLine();
   
   if(product.equals("banana")){
       if(daysOfWeek.equals("Weekday"))
           System.out.println("2.50");
       else
           System.out.println("2.70");
       }
   else if(product.equals("apple")){
       if(daysOfWeek.equals("Weekday"))
           System.out.println("1.30");
       else
           System.out.println("1.60");
   }
   else if(product.equals("kiwi")){
       if(daysOfWeek.equals("Weekday"))
           System.out.println("2.20");
       else
           System.out.println("3.00");
   }
   else
       System.out.println("Wrong fruit!!!");

//9. Write a program, that reads 3 numbers from the console and prints the biggest of them.

   Scanner s = new Scanner(System.in);
   System.out.println("Enter first number: ");
   int a = s.nextInt();
   System.out.println("Enter second number: ");
   int b = s.nextInt();
   System.out.println("Enter third number: ");
   int c = s.nextInt();
   
   if(a > b && a > c){
       System.out.println("The biggest number is: "+a);
   }
   else if(b > a && b > c){
       System.out.println("The biggest number is: "+b);
   }
   else if(c > a && c > b){
       System.out.println("The biggest number is: "+c);
   }
   else
       System.out.println("The numbers are same.");



   Scanner s = new Scanner(System.in);
   System.out.println("Enter item: ");
   String item = s.nextLine();
   
   if(item.equals("pizza") || item.equals("spaghetti") || item.equals("giros"))
       System.out.println("food");
   else if(item.equals("tea") || item.equals("water"))
       System.out.println("drink");
   else
       System.out.println("Unknown");

   Scanner s = new Scanner(System.in);
   var num = s.nextDouble();
   
   boolean valid = (num>=100 && num<=200) || (num==0);
   if(!valid){
       System.out.println("Invalid");
   }

//SWITCH CASE

   int day = 2;
   
   switch(day){
       case 1:
           System.out.println("Monday");
           break;
       case 2:
           System.out.println("Tuesday");
           break;
       case 3:
           System.out.println("Wednesday");
           break;
       case 4:
           System.out.println("Thursday");
           break;
       case 5:
           System.out.println("Friday");
           break;
       case 6:
           System.out.println("Saturday");
           break;
       case 7:
           System.out.println("Sunday");
           break;
       default:
           System.out.println("Unknown day");
   }

   Scanner s = new Scanner(System.in);
   String choice = s.nextLine();
   choice = choice.toLowerCase();
   
   switch(choice){
       case "y":
           System.out.println("Yes");
           break;
       case "n":
           System.out.println("No");
           break;
       default:
           System.out.println("Invalid response");
           break;
   }

  Scanner s = new Scanner(System.in);
  String animal = s.nextLine();
  
  switch(animal){
      case  "dog":
      case  "cat":
          System.out.println("mammal");
          break;
      default:
          System.out.println("Unknown");
          break;
  }


// use switch case
    //enter num [1-4] to choose a figure
    // 1 - square
    // 2 - rectangle
    // 3 - triangle
    // 4 - circle
    // enter length, width, or radius to find area
    
   Scanner s = new Scanner(System.in);
   System.out.println("Enter number [1-4] : ");
   int num = s.nextInt();
   
   switch(num){
       case 1:
           System.out.println("Enter the length of the square: ");
           int a = s.nextInt();
           int area = a * a;
           System.out.println("Area of square is: "+area);
          break;
       case 2:
           System.out.println("Enter the length of the rectangle: ");
           int b = s.nextInt();
           System.out.println("Enter the width of the rectangle: ");
           int c = s.nextInt();
           area = b * c;
           System.out.println("Area of rectangle is: "+area);
           break;
       case 3:
           System.out.println("Enter the length of triangle: ");
           int d = s.nextInt();
           System.out.println("Enter the height of triangle: ");
           int e = s.nextInt();
           area = (d * e) / 2;
           System.out.println("Area of triangle is: "+area);
           break;
       case 4:
           System.out.println("Enter radius of circle: ");
           int r = s.nextInt();
           area =  (int) (r * r * Math.PI);
           System.out.println("Area of circle is: "+area);
           break;
       default:
           System.out.println("Wrong input");

}


   Scanner s = new Scanner(System.in);
   System.out.println("Enter food: ");
   String item = s.nextLine();
   
   if(item.equals("banana") || item.equals("apple") || item.equals("kiwi") || item.equals("strawberry")){
       System.out.println("Fruit");
   }
   else if(item.equals("cucumber") || item.equals("pepper") || item.equals("carrot")){
       System.out.println("Vegetables");
   }
   else
       System.out.println("Unknown");


//10  Write a program to check a letter for vowel or consonant:
//    - read a letter from the english alphabet
//    - print either "Vowel" or "Consonant"

   Scanner s = new Scanner(System.in);
   System.out.println("Enter one letter: ");
   String input = s.nextLine();
   input = input.toLowerCase();
   char letter = input.charAt(0);
   
   if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u'){
       System.out.println("Vowel");
   }
   else
       System.out.println("Consonant");

//11. Calculate the sign of the product of 3 numbers:
//    - read 3-floating-point numbers
//    - print the sign of the product of the entered 3 numbers: 
//      positive, negative or zero
//    Try to do this without multiplying the numbers.

   Scanner s = new Scanner(System.in);
   System.out.println("Enter first number: ");
   int a = s.nextInt();
   System.out.println("Enter second number: ");
   int b = s.nextInt();
   System.out.println("Enter third number: ");
   int c = s.nextInt();
   int multiply = a * b * c;
   
   if((a>0 && b>0 && c>0) || (a<0 && b<0 && c>0 || a>0 && b<0 && c<0 || a<0 && b>0 && c<0))
       System.out.println("Multiply of three numbers are positive, it is: "+multiply);
   else if((a<0 && b<0 && c<0) || (a<0 && b>0 && c>0 || a>0 && b<0 && c>0 || a>0 && b>0 && c<0))
       System.out.println("Multiply of three numbers are negative, it is: "+multiply);
   else
       System.out.println("Multiply are zero");
   
   

//12. Write a program, which calculates vacation expenses:
//    - reads season, accommodation type and count of the days
//    - prints the total expens, based on the criteria's below, formatted to the 2nd digit after the decimal point.

//    Season    Hotel    Camping    Discount
//    Spring     30         10         20%
//    Summer     50         30          0
//    Autumn     20         15         30%
//    Winter     40         10         10%

   Scanner s = new Scanner(System.in);
   System.out.println("Enter season: ");
   String season = s.nextLine().toLowerCase();
   System.out.println("Enter type of accommodation: ");
   String accommodation = s.nextLine().toLowerCase();
   System.out.println("Enter number of days: ");
   int days = s.nextInt();
   
   double rate = 0;
   if(season.equals("spring")){
       if(accommodation.equals("hotel"))
           rate = 30 * 0.8;              //1-(20/100) = 0.8
       else
           rate = 10 * 0.8;
   }
   else if(season.equals("summer")){
       if(accommodation.equals("hotel"))
           rate = 50;
       else
           rate = 30;
   }
   else if(season.equals("autumn")){
       if(accommodation.equals("hotel"))
           rate = 20 * 0.7;            //1-(30/100) = 0.7
       else
           rate = 15 * 0.7;
   }
   else if(season.equals("winter")){
       if(accommodation.equals("hotel"))
           rate = 40 * 0.9;           //1-(10/100) = 0.9
       else
           rate = 10 * 0.9;
   }
   double expenses = rate * days;
   System.out.printf("Expenses = %.2f\n", expenses);
    
//13. CALCULATOR

   Scanner s = new Scanner(System.in);  //kreiram si obekt ot klasa scanner
   System.out.println("Enter first number: ");
   int a = s.nextInt();
   System.out.println("Enter second number: ");
   int b = s.nextInt();
   System.out.println("Enter operation [+, -, *, /, %] ");
   char operation = s.next().charAt(0);
   int result;
   
   switch(operation){
       case '+':
           result = a + b;
           System.out.println(a+ " + "+b+ " = "+result);
           break;
       case '-':
           result = a - b;
           System.out.println(a+ " - "+b+ " = "+result);
           break;
       case '*':
           result = a * b;
           System.out.println(a+ " * "+b+ " = "+result);
           break;
       case '/':
           result = a / b;
           System.out.println(a+ " / "+b+ " = "+result);
           break;
       case '%':
           result = a % b;
           System.out.println(a+ " % "+b+ " = "+result);
           break;
       default:
           System.out.println("Wrong operation!");
           break;
   }    

//14. Write a program to find the biggest among 5 numbers.

   Scanner s = new Scanner(System.in);
   System.out.println("Enter five numbers: ");
   int a = s.nextInt();
   int b = s.nextInt();
   int c = s.nextInt();
   int d = s.nextInt();
   int e = s.nextInt();
   
   if(a>b && a>c && a>d && a>e)
       System.out.println("The biggest number is: "+a);
   else if(b>a && b>c && b>d && b>e)
       System.out.println("The biggest number is: "+b);
   else if(c>a && c>b && c>d && c>e)
       System.out.println("The biggest number is: "+c);
   else if(d>a && d>b && d>c && d>e)
       System.out.println("The biggest number is: "+d);
   else
       System.out.println("The biggest number is: "+e);
}    
}
