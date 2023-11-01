package src.main.java.classworks.Lesson6;

public class ArrayPractce1 {
    public static void main(String[] args) {
        int[] numbers = {1, 444, -21 - 98980, 84, 11, 5454, 212, -90, 10};//print out array
        for (int a = 0; a < numbers.length; a++) {
            System.out.print(numbers[a] + "; ");
        }
        System.out.println();//next line
        for (int i = 0; i < numbers.length; i++) {//+5
            numbers[i] = numbers[i] + 5;
        }
        for (int b = 0; b < numbers.length; b++) {
            System.out.print(numbers[b] + "; ");
        }
    }
}