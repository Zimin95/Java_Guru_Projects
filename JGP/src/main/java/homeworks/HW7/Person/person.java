package src.main.java.homeworks.HW7.Person;

public class person {
    String name;
    String surname;
    int age;
    boolean isHared;

    public  person(int birthYear,String name) {
        this.age =2023-birthYear;
        this.name = name;
    }

    public person(String name){
        this.name = name;
        this.age = 0;
    }
       public void hire(){
        this.isHared = true;
    }
        public void fire(){
        this.isHared = false;
        }
        public void makeOlder(){
        this.age ++;
        }
        public String getSurname() {
            return this.surname;
        }
        public void setSurname(String surname) {
            this.surname = surname;
        }
}
