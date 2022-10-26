package semex2;
public class SemEx2 {
    public static void main(String[] args) {
        System.out.println(true || false);
    int a = 5;
    System.out.println((a > 10));
    System.out.println(a > 10 ? "bigger " : "smaller");   // Proverqva se uslovieto, ako e tochno ispisva se purvoto, 
                                                          // ako ne e tochno ispisva vtoroto
    System.out.println(!(10 < 15));
    triggerTernaryOperation();
    increment();
    bitwise();
    printSemiPyramid();
    }

    public static void triggerTernaryOperation() {
        int a = 11;
        System.out.println(a > 10 ? "bigger " : "smaller");
        System.out.println(!(10 < 15)); //v skobite e true
                                        //razlichno ot true printira false
    }

    public static void increment() {
//        int a = 10;
//        int b = 5;
//        a++;
//        a = a + 1;
//        a + = 1;
//        System.out.println(a);
//        System.out.println(a++);
//        System.out.println(++a);
//        int b = a++ * ++a;     //10 * 12 = 120
//        System.out.println(b);
        
        
       //a++ - purvo shte se vzeme stoinostta na a, a sled tova shte se uvelichi
       //++a - purvo a shte se uvelichi
    }

    public static void bitwise() {
        int a = 1;
        int b = 5;

        System.out.println(b & a);

        //int a = 5;
        //int b = 2;

        System.out.println(b | a);
        System.out.println(Integer.toBinaryString(b | a) + " or that is: " + (a | b));
    }

    public static void ifelse() {
        int i = 10;
        if (i == 10) {
            System.out.println("Number is 10");
        }
        else if(i > 10) {
            System.out.println("Number is bigger than 10");
        }
        else {
            System.out.println("Number is smaller than 10");
        }
    }

    public static void printSemiPyramid() {
        int a = 3;
        String charToRepeat = "*";
        for (int i = 0; i < a; i++) {
            System.out.println(" ".repeat(a - i - 1) + charToRepeat.repeat(i + 1));
            System.out.println(customRepeat(" ", a - i - 1)
            + customRepeat("*", (i + 1)));
            }
    }

    public static String customRepeat(String stringToRepeat, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += stringToRepeat;
        }
        return result;
    }
}    
