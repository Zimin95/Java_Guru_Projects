package src.main.java.classworks.Lesson8.vehicleParc;


    public class Truck extends Car {
        int maxLoad;



        public void loadUp(int amount) {
            System.out.println("Truck has been loaded by " + amount);
            this.maxLoad = this.maxLoad - amount;
            ;
        }

        Truck(String driver, String numberPlate, int maxLoad) {
            super(driver, numberPlate);
            this.maxLoad = maxLoad;
        }


        public void wash() {

            System.out.println("Your Truck " + numberPlate + "is clean!");
        }



        }

