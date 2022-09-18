package Arrays;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in); // Using Scanner for receiving Input

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5); // Declaration of Array in Java
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i +", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number]; // index of array can be dynamically allocated by giving parameter (Only at the Declaration)

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        /* for (int j : array) {
            sum += j;
        } */

        for(int i=0; i< array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double)array.length;

    }
}
