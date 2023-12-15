package src.main.java.classworks.Lesson8.animalKingdom;

public class Cat extends Animal {
    boolean isStriped;

    public Cat(){
        super("Cat");
        super.setSound("Meow");
        isStriped = false;
    }
    public boolean isStriped() {
        return isStriped;
    }

    public void setStriped(boolean striped) {
        isStriped = striped;
    }


}
