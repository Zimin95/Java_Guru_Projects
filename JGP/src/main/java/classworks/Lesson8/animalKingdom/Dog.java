package src.main.java.classworks.Lesson8.animalKingdom;

public class Dog extends Animal {
    String bread;
    public Dog(){
        super("Dog");
        super.setSound("Bark");
    }
    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
    public void givePaw(){
        System.out.println("This dog gave you its paw");
    }


}
