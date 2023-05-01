package di;

public class CarMain {
    public static void main(String[] args) {
        Engine engine = new ElectricEngine();
        Car car = new AutoCar(engine);
        car.drive();
    }
}
