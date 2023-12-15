package src.main.java.classworks.Lesson8.vehicleParc;

public class Bicycle extends Vehicle {

    boolean isFolded;
    int speedCount;

    public Bicycle() {
        super();
        this.isFolded = true;
        this.speedCount = 1;
    }


    public boolean fold() {
        if (this.isFolded)
            return false;
        else {
            this.isFolded = true;
            return true;

        }
    }
    public boolean isFolded() {
        return isFolded;
    }
    Bicycle(String driver) {
        super(driver);
    }
    @Override
    public void loadUp(){
        super.loadUp();
        System.out.println("Does not have load function");
    }
    @Override public void wash() {
        super.wash();
        System.out.println("no need to wash");


    }
}