public class Main {
    public static void main(String[] args) {

        //1. Given an array of integers find the biggest integer.

       int[] array = {24, 4, 7, 8, 10, 15};
       int max = array[0];

       for (int i = 0; i < array.length; i++) {
           if (array[i] > array[0]) {
               max = array[i];
           }
       }
       System.out.println("Max element is: " + max);
   }

        // 2. Given an array of integers find the smallest integer.

        int[] array = {-24, -4, -7, -8, -10, -15};
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[0]) {
                min = array[0];
            }
        }
        System.out.println("Min element is: " + min);
    }
}
