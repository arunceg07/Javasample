package InternalJavaPGMS;

import java.util.Arrays;

public class ArraysSorting {

    public static void main(String[] args)
    {
        System.out.println("Array Sorting");
        int [] intArray = {1,34,2,54,76,23,-43};
        int temp=0;

//        for (int i =0; i<=intArray.length-1; i++)
//        {
//           for (int j = i+1; j<=intArray.length-1; j++)
//           {
//               if (intArray[i]>intArray[j])
//               {
//                   temp = intArray[i];
//                   intArray[i] = intArray[j];
//                   intArray[j] = temp;
//               }
//           }
//        }
        for (int i =0; i<=intArray.length-1; i++)
        {
            System.out.print(intArray[i]+",");
        }

        System.out.println("");

        Arrays.sort(intArray);

        for (int i =0; i<=intArray.length-1; i++)
        {
            System.out.print(intArray[i]+",");
        }
    }
}
