package src.main.java.classworks.Lesson6;

public class calcCircleArea {
    static double CalcCircleArea(double radius) {
        double square;
        square = Math.PI * (radius*radius);
        return square;

    }
        public static void main (String[]args){
        double Nes= CalcCircleArea(4.56);
        System.out.println("Circle Area is "+Nes);


        }

}