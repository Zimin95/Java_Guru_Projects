package src.main.java.classworks.Lesson8.vehicleParc;

public class Sedan extends Car{
    int seats;
    Sedan (String driver, String numberPlate, int numberOfSeats) {
        super(driver, numberPlate);
        this.seats = numberOfSeats;
    }
        @Override

        public void loadUp(){

            System.out.println("Does not have load function");
        }
   @Override public void wash() {

        System.out.println("This sedan " + numberPlate+ " is not clean");
    }

    }
