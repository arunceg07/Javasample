package InternalJavaPGMS;

import java.util.Arrays;

public class ArraySortingSubsetofArray {

    public static void main(String[] args)
    {
        int[] intArray = {46, 1, 21, 1, 32, 2, 46, 21, 1, 32, 98, 43, 97};

        Arrays.sort(intArray,1,6);

        for (int i: intArray) {
            System.out.println(i);
        }

    }
}
