package src.main.java.classworks.lesson5;

public class switchPracticeDayOfTheWeek {
    public static void main(String[] args) {
        int dayNumber = 6;
        String dayName;
        switch (dayNumber){
            case 1:dayName ="Monday";
            case 2:dayName ="Tuesday";
            case 3:dayName ="Wednesday";
            case 4:dayName ="Thursday";
            case 5:dayName ="Friday";
            dayName ="looking forward to the weekend";break;

            case 6:dayName ="Saturday";break;
            case 7:dayName ="Sunday";break;
            default:dayName="invalid day number";
            System.out.println(dayName);

        }
        System.out.println(dayName);
    }
}
