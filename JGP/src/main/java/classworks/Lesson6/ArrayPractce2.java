package src.main.java.classworks.Lesson6;

public class ArrayPractce2 {
    public static void main(String[] args) {
        int[]numbers ={1,423,56,34,78,876,-3223-654,32235,11};
        for (int i:numbers){
            System.out.print(i+ "; ");
        }
        for (int i=0;i<numbers.length;i++){
           numbers [i] = numbers[i] + 5;
        }
        System.out.println();
        for (int i:numbers){
            System.out.print(i +"; " );
        }
    }
}
