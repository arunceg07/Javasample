package InternalJavaPGMS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class DuplicateRemovalinArrayusingcollections {

    public static void main(String[] args)
    {
        System.out.println("Duplicate Removal in Array");

        Integer [] intArray = {1,21,1,32,2,46,21,98,43,97};

        ArrayList<Integer> intList = new ArrayList(Arrays.asList(intArray));
        System.out.println("intList");



        System.out.println(intList);


        HashSet<Integer> intHashSet = new HashSet(Arrays.asList(intArray));
        System.out.println("intHashSet");

        System.out.println(intHashSet);


        TreeSet<Integer> intTreeSet = new TreeSet(Arrays.asList(intArray));
        System.out.println("intTreeSet");

        System.out.println(intTreeSet);

    }
}
