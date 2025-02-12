package engineeringDigestCoreJava.com.innerClasses;

public class test {
    public static void main(String[] args) {
        Car car = new Car("TATA safari");
        Car.Engine engine = car.new Engine();
        engine.start();//new instance of engine is created with the instance of outer class.
        engine.stop();
    }
}
