package src.main.java.classworks.Lesson8.animalKingdom;

public class Mouse extends Animal {
    String food;
    boolean isScientific;

    public boolean isScientific() {
        return isScientific;
    }

    public void setScientific(boolean scientific) {
        isScientific = scientific;
    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void tryToFeedFood(String food){
        if (!isScientific) {
            this.food = food;
        }
        else this.food="";
    }
}

