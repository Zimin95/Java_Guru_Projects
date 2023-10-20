package src.main.java.classworks.lesson5;

public class nameSurnameConcatenation {
    public static void main(String[] args) {
        String name = "Nikolay";
        String surname= "Zimin";

        System.out.println(name+" "+ surname );
        System.out.println(name.concat( " ").concat(surname));
        System.out.println(surname+","+" "+name);
        System.out.println(surname.concat(","+" ").concat(name));
    }
}
