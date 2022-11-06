public class Main {
    public static void main(String[] args) {
//        1.Създайте клас Car. Като член променливи има марка, модел, цвят, мощност, тип двигател, тип скоростна кутия, година на производство.
//        Създайте гет и сет методи. Създайте конструктор с и без параметри.
//
//        2.Създайте метод, който по подаден масив от коли и параметър буква(char), “прочиства” масива от коли и връща нов масив от коли,
//        на които марките им започват с подадената като параметър буква.
//
//        3.Създайте втори метод, който по подаден параметър масив от коли, връща отново масив от коли, но сортиран по възходящ или
//        по низходящ ред, в зависимост от марката на колата. Нека редът да се определя от параметър на метода.
//
//        4.Създайте трети метод, който по подаден масив от коли проверява дали измежду колите има повтарящи се и връща
//        “прочистен” масив от коли, в който няма повтарящи се коли.
//
//        5.Създайте клас Test с main метод, в който създайте няколко коли и изтествайте трите метода дали работят правилно.

        Car car1 = new Car("Ford", "Explorer", "white",
                134.5, "sfagd", "asga", 2003);
        Car car2 = new Car("Ford", "Explorer", "white",
                134.5, "sfagd", "asga", 2003);
        Car car3 = new Car("Bugatti", "Verone", "blue",
                12.5, "sgaddga", "wqrwqwr", 2002);
        Car car4 = new Car("Volkswagen", "Golf", "blue",
                8.5, "gaddag", "wdaga", 2020);

        Car emptyClass = new Car();

        Car[] cars = new Car[]{car1, car2, car3, car4};

        System.out.println("Array: ");
        printArr(cars);

        //method 1 test
        Car[] carsWithLetterF = emptyClass.getCarsWithSameLetter(cars, 'F');
        System.out.println("\nCars With Brand That Starts With F: ");
        printArr(carsWithLetterF);

        //method 2 test
        cars = emptyClass.getUniqueCars(cars);
        System.out.println("Unique Array: ");
        printArr(cars);

        //method 3 test
        cars = emptyClass.sortCarsByBrandLetter(cars, true);
        System.out.println("Sorted Ascending: ");
        printArr(cars);

        cars = emptyClass.sortCarsByBrandLetter(cars, false);
        System.out.println("Sorted Descending: ");
        printArr(cars);

    }

    private static void printArr(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}