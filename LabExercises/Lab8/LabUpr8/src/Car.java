public class Car {
    private String brand;
    private String model;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public class Engine
    {
        @Override
        public String toString() {
            return "Engine{" +
                    "power=" + power +
                    ", fuelType=" + fuelType +
                    '}';
        }


        private int power;
        public enum FuelType
        {
            DIESEL,
            PETROL,
            ELECTRIC
        }
        private FuelType fuelType;

        public Engine(int power, FuelType fuelType) {
            this.power = power;
            this.fuelType = fuelType;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public FuelType getFuelType() {
            return fuelType;
        }

        public void setFuelType(FuelType fuelType) {
            this.fuelType = fuelType;
        }
    }


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
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
}