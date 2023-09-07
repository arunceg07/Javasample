package InternalJavaPGMS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetToArray {

    public static void main(String[] args) {
        HashSet<Integer> sampleSet = new HashSet<>();
        sampleSet.add(1);
        sampleSet.add(2);
        sampleSet.add(3);
        sampleSet.add(4);
        sampleSet.add(1);
        sampleSet.add(5);


//        Iterator setIt = sampleSet.iterator();
//
//        while (setIt.hasNext())
//        {
//           System.out.println("setIt--"+ setIt.next());
//
//        }


//       Object [] objectArray = sampleSet.toArray();
//
//        for (int i = 0; i<= objectArray.length-1; i++)
//        {
//            System.out.println("objectArray--"+ objectArray[i]);
//        }

       int [] intarray = sampleSet.stream().mapToInt(Number::intValue).toArray();


                for (int i = 0; i<= intarray.length-1; i++)
        {
            System.out.println("intArray--"+ intarray[i]);
        }

    }
}
