package src.main.java.classworks.Lesson8.vehicleParc;


public class Vehicle {



    String brand;
    String colour;
    String driver;

    public String getDriverInfo() {
        return ("Vehicle is operated by the driver " +  driver);
    }



    public void wash() {

    }
     public void loadUp(){

    }
    Vehicle () {
        this.brand = " ";
        this.colour = "";
        this.driver = "";
    }
    Vehicle (String driver) {
        this.brand = " ";
        this.colour = "";
        this.driver = driver;
    }

    }
