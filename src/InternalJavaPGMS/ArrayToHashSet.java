package InternalJavaPGMS;

import java.util.HashSet;

public class ArrayToHashSet {
    public static void main(String[] args) {
        int [] intArray = {1,2,3,4,5,6,7,8,9,10};

        HashSet<Integer> arraytoSet = new HashSet<Integer>();
        for (int i=0; i<=intArray.length-1;i++)
        {
            arraytoSet.add(intArray[i]);
        }

        System.out.println(arraytoSet);


    }
}
