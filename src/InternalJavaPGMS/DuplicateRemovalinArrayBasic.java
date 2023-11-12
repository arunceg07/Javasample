package InternalJavaPGMS;
import java.util.ArrayList;

public class DuplicateRemovalinArrayBasic {

    public static void main(String[] args) {
        System.out.println("Removing Duplicate elements in Array");
        int[] intArray = {46, 1, 21, 1, 32, 2, 46, 21, 1, 32, 98, 43, 97};
//        int[] intArray = {1,4,3,1,4,5,2,1,2};
        int count;
        ArrayList<Integer> intList = new ArrayList();
        for (int i = 0; i <= intArray.length - 1; i++) {
            count = 1;
            for (int j = i + 1; j <= intArray.length - 1; j++) {
                if (intArray[i] == intArray[j]) {
                    intArray[j] = 0;
                    count++;
                }
            }

            // To Print Duplicate numbers
//            if (count > 1 && intArray[i] != 0) {
////                System.out.println(intArray[i]);
//                intList.add(intArray[i]);
//            }
//        }

   //          To remove Duplicate numbers and print the remaing
            if (intArray[i] != 0) {
//                System.out.println(intArray[i]);
                intList.add(intArray[i]);
            }
        }

//        System.out.println(intList);

        int temp;
        for (int i = 0; i <= intList.size() - 1; i++) {
            for (int j = i + 1; j <= intList.size() - 1; j++) {

                if (intList.get(i)>intList.get(j))
                {
                    temp =  intList.get(i);
                    intList.set(i, intList.get(j));
                    intList.set(j, temp);

                }
            }
        }

        System.out.println(intList);
    }
}

