package InternalJavaPGMS;
import java.util.ArrayList;

public class ListToArray {
    public static void main(String args[]){

        System.out.println("ArrayList to Array");

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

      int [] intArray =  intList.stream().mapToInt(Number::intValue).toArray();

        for (int i = 0; i<= intArray.length-1; i++)
        {
            System.out.println("intArray--"+ intArray[i]);
        }


    }
}
