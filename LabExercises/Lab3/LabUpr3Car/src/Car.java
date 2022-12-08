import java.util.Arrays;
import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private String color;
    private double power;
    private String engineType;
    private String gearboxType;
    private int year;

    public Car() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car) o;
        return Double.compare(car.power, power) == 0 && year == car.year && Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(engineType, car.engineType)
                && Objects.equals(gearboxType, car.gearboxType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, power, engineType, gearboxType, year);
    }

    public Car(String brand, String model, String color, double power, String engineType, String gearboxType, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.power = power;
        this.engineType = engineType;
        this.gearboxType = gearboxType;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car[] getCarsWithSameLetter(Car[] cars, char letter) {
        Car[] carsWithSameLetter = {};

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].brand.charAt(0) == letter) {
                carsWithSameLetter = addToArray(carsWithSameLetter, cars[i]);
            }
        }
        return carsWithSameLetter;
    }

    public Car[] sortCarsByBrandLetter(Car[] cars, Boolean ascending) {
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length; j++) {
                if (ascending) {
                    //ascending
                    if (cars[i].brand.charAt(0) < cars[j].brand.charAt(0)) {
                        cars = swap(cars, i, j);
                    }
                } else {
                    //descending
                    if (cars[i].brand.charAt(0) > cars[j].brand.charAt(0)) {
                        cars = swap(cars, i, j);
                    }
                }
            }
        }
        return cars;
    }

    public Car[] getUniqueCars(Car[] cars) {
        Car[] uniqueArr = {};

        for (Car car : cars) {
            if (!Arrays.asList(uniqueArr).contains(car)) {
                uniqueArr = addToArray(uniqueArr, car);
            }
        }
        return uniqueArr;
    }

    @Override
    public String toString() {
        return "" + this.brand + "-" + this.model;
    }

    //private methods
    private Car[] addToArray(Car[] cars, Car car) {
        Car[] temp = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            temp[i] = cars[i];
        }
        temp[temp.length - 1] = car;
        return temp;
    }

    private Car[] swap(Car[] cars, int i, int j) {
        Car temp = cars[i];
        cars[i] = cars[j];
        cars[j] = temp;
        return cars;
    }
}