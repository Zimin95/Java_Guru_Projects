package src.main.java.classworks.Lesson8.vehicleParc;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        /*Vehicle BMW = new Vehicle();
        BMW.driver = "George";
        System.out.println(BMW.getDriverInfo());

        Car Audi = new Car();
        Audi.driver = "Aleksey";
        System.out.println(Audi.getDriverInfo());
        Audi.numberPlate = "LV -2208";
        Audi.wash();
        Sedan Lada = new Sedan();

        Lada.driver = "Sanya";
        Lada.numberPlate = " RU - 3232";
        System.out.println(Lada.getDriverInfo());
        Lada.wash();
        System.out.println("This car has " + Lada.seats + " passengers seats" + "");*/
        Car Jeep = new Car("Boris", "LV-1818");
        Car BMW = new Car("Leonel", "LM-1212");
        Truck Volvo = new Truck("Max", "LT-3434",6000);
        Truck Man = new Truck("Roberto","LU-5493",777);
        Truck Maz = new Truck("Ivan", "LB-4343", 7000);
        Sedan Lexus  = new Sedan("George", "LX-5599",6);
        Sedan Toyota = new Sedan("Martin","LA-3257",7);
        Sedan Peugeot = new Sedan("John", "LR-7234", 8);
        Bicycle BMX = new Bicycle("Alberto");
        Bicycle Aist = new Bicycle("Salvatore");

        Vehicle[] VehiclesList = {Jeep, BMW, Volvo, Man, Maz, Lexus, Toyota, Peugeot, BMX, Aist};

        for (Vehicle v : VehiclesList) {
            System.out.println(v.getDriverInfo());
            v.wash();
            v.loadUp();

            System.out.println();
            if (v instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) v;
                System.out.println("Is Folded: " + bicycle.isFolded());
            }

        }
    }
}


