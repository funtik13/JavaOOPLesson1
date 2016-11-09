package ua.kiev.prog.OOP;

public class Engine {
    private double engineCapacty;
    private boolean engineIsStarted;

    public Engine(double engineCapacty){
        this.engineCapacty = engineCapacty;
    }

    public void starTheEngine(){
        engineIsStarted = true;
    }

    public void shutDownTheEngine(){
        engineIsStarted = false;
    }


    public double getEngineCapacty() {
        return engineCapacty;
    }

    public void setEngineCapacty(double engineCapacty) {
        this.engineCapacty = engineCapacty;
    }

    public boolean isEngineIsStarted() {
        return engineIsStarted;
    }

    public void setEngineIsStarted(boolean engineIsStarted) {
        this.engineIsStarted = engineIsStarted;
    }
}
