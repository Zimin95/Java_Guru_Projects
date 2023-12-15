package src.main.java.classworks.Lesson8.vehicleParc;

public class Car extends Vehicle {
    String numberPlate;
    String model;


           @Override public void wash() {
               super.wash();
        System.out.println("Your Vehicle has been washed.Number plate: "+ numberPlate);
    }


    Car(String driver, String numberPlate) {
        super(driver);
        this.numberPlate = numberPlate;

    }
    @Override public void loadUp(){
               System.out.println("Does not have load function");
    }

}