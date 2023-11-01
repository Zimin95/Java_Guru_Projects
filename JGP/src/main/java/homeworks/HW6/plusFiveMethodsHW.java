package src.main.java.homeworks.HW6;

public class plusFiveMethodsHW {
    public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");

    }
    System.out.println();
}

    public static void plusFive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]+= 5;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, -144, 9696, 3, 43, 655, 0, 432, 930, 931};

        printArray(numbers);

        plusFive(numbers);

        printArray(numbers);
    }

}

