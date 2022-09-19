package Reference_Types_Value_Types;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Declaration by Value Type.
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        // myIntValue remains the same while anotherIntValue Incremented.


        // Declaration by Reference Type Value
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));
        // Both myIntArray and anotherArray has declared as Array Type Class
        // So it needs to be converted as String Type value to be displayed by using toString methods.

        anotherArray[0] = 1;
        // because myIntArray and anotherArray both reference type & indicating same memory address
        // even if only anotherArray[0]'s value changed to 1, also myIntArray will be affected by its changes.

        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4, 5, 6, 7, 8};
        // Now the reference Type value of anotherArray has changed
        // System will allocate new memory address by new int[]{4,5,6,7,8}; and return its memory address to anotherArray
        modifyArray(myIntArray);
        // because of the task executed previously, now the modification of myIntArray will not affect anotherArray.

        System.out.println("after modify myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray= " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
