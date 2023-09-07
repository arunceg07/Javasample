package InternalJavaPGMS;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList {


    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 45, 32};

        ArrayList<Integer> arrayToList = new ArrayList<Integer>();

        for (int i=0; i<=intArray.length-1;i++) {
            arrayToList.add(intArray[i]);
        }

        System.out.println("intArray--"+ arrayToList);

    }
}
