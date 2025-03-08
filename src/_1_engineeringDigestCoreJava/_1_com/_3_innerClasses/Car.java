package _1_engineeringDigestCoreJava._1_com._3_innerClasses;

public class Car {
    private String model;

    private boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine {  // Member Inner Class
        void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model + "Engine is Started.");
            }
            else{
                System.out.println(model + "already started");
            }
        }
        void stop() {
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + "Engine stopped");
            }
            else{
                System.out.println(model + "Engine is already off.");
            }
        }
    }
}
