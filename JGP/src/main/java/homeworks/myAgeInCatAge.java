package src.main.java.homeworks;

public class myAgeInCatAge {
    public static void main(String[] args) {
        //variables declaration.
        int MyAge;
        int CatAge;
        int OneCatAgeInHumanAge;
        //Variables value declaration.
        MyAge = 28;
        CatAge = 6;
        OneCatAgeInHumanAge = 7;
        //Answer my cat's age in human age.
        System.out.println("My cat's age in human age is " + CatAge * OneCatAgeInHumanAge);
        //Answer my age in cat's age.
        System.out.println("My age in cat's age is " + MyAge * OneCatAgeInHumanAge);
    }
}