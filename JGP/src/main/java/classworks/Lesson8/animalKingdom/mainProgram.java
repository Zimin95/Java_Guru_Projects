package src.main.java.classworks.Lesson8.animalKingdom;

public class mainProgram {
    public static void main(String[] args) {
        Animal cow = new Animal();
        cow.setSound("Moo");
       System.out.println(cow.makeSound());
       Dog Tuzik = new Dog();
       System.out.println(Tuzik.makeSound());
       Cat murzik = new Cat();
       System.out.println(murzik.makeSound());
       Tuzik.givePaw();
       System.out.println("There are striped?" + murzik.isStriped);
       Mouse Mickey = new Mouse();
       Mickey.setScientific(true);
       Mickey.tryToFeedFood("crumbles");
       System.out.println("Food has been fed: "+Mickey.getFood());


    }
}
