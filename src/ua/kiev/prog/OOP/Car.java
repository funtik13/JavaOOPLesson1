package ua.kiev.prog.OOP;

public class Car {
    private String name;
    private Engine engine;

    public Car(String name){
        this.name = name;
        engine = new Engine(1);
    }

    public Car(String name, double capacity){
        this.name = name;
        engine = new Engine(capacity);
    }

    public void start(){
        engine.starTheEngine();
        System.out.println("Engine is started");

    }

    public void stop(){
        engine.shutDownTheEngine();
        System.out.println("Engine is stoped");
    }

    public void move(int speed, int distance){
        if (!engine.isEngineIsStarted()) {
            start();
        }
        System.out.println("You passed " + distance +
                " kilometres with speed " + speed + "km/perhour, and used "
                + (fuelRate() * ((double)distance / 100)
                * ((double)speed / 100)) + " liters of fuel.");
        stop();
    }

    public double fuelRate(){
        return engine.getEngineCapacty()*6;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
