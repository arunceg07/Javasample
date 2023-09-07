package InternalJavaPGMS;

import java.util.ArrayList;
import java.util.TreeSet;

public class HashSetTreeSetFunctions {

    public static void main(String[] args)
    {

        int [] intArray1 = {5, 7, 8, 85, 13, 3, 7, 21, 10, 5, 3};
        ArrayList<Integer> List1 = new ArrayList<Integer>();
       for (int i: intArray1)
       {
           List1.add(i);
       }

       System.out.println("List1 Array List"+List1);
        TreeSet <Integer> TSet1 = new TreeSet<Integer> (List1);
        System.out.println("TSet1 Default Ascending Order-- "+TSet1);

        System.out.println("TSet1 Default Dscending Order "+TSet1.descendingSet());

    }
}
