package src.main.java.classworks.lesson7.personManagement;

public class personManagementMain {
    public static void main(String[] args) {
        person kolya= new person("Nikolay","Zimin",28);
       person dima =new person("Dmitry");
        kolya.celebrateBirthday();
        System.out.println(kolya.age);
        System.out.println(dima.age);

        book Bible = new book();
        System.out.println(Bible.title);
    }
}
