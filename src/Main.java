import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" how many number you would like to insert in a array: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        int[] returnArray = readInteger(number);
        int returnMIn = findMinimum(returnArray);
        System.out.println(" your minimum number is " + returnMIn);
    }

    public static int[] readInteger(int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int count = scanner.nextInt();
            array[i] = count;
        }
        return array;
    }

    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}