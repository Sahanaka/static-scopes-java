
/**
 * This program is about the static keyword
 * static variables and methods are experimented
 *
 * Aims to use a simple getMax function
 * */

import java.util.Arrays;
import java.util.Random;

public class Experiment
{
    static int getMax(int x, int y)
    {
        if (x != y)
        {
            if (x > y)
                return x;

            else return y;
        }

        else return 0;
    }

    static void orderedArray(int[] arr)
    {
        Arrays.sort(arr);
    }

    static void printArray(int[] arr)
    {
        for (int i : arr)
            System.out.print(i + " ");

        System.out.println();
    }

    public static void main(String[] args)
    {
        Random rand =  new Random(); // Creates random object

        int first = 20, second = 10, third = 50, fourth = 4;

        System.out.println(Experiment.getMax(first, second)); // Syntax 01
        System.out.println(getMax(third, second)); // Syntax 02
        System.out.println(getMax(second, fourth));

        int[] array = new int[5];

        // Arrays.fill(array, ranNum); can be used to fill an array with a number

        printArray(array); // array elements are initialized to zero

        // array with random numbers
        for (int i = 0; i < 5; ++i)
        {
            int ranNum = rand.nextInt(10);
            array[i] = ranNum;
            System.out.print(array[i] + " ");
        }

        System.out.println();

        orderedArray(array); // sorts array
        printArray(array);

        System.exit(0);
    }
}
