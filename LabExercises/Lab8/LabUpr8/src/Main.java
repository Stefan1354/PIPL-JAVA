public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("A", "B");
        Car.Engine engine1 = car1.new Engine(100, Car.Engine.FuelType.DIESEL);
        System.out.println(engine1);
    }
}