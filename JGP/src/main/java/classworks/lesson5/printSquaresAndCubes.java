package src.main.java.classworks.lesson5;

public class printSquaresAndCubes {
    public static void main(String[] args) {

        System.out.println("squares---- cubes ----");
        for (int i = 0 ;i<21;i++){
            int square = i * i;
            int cube= i*i*i;
            System.out.println(i+" squared: "+ square + ";cubed "+ cube);


        }

    }
}
