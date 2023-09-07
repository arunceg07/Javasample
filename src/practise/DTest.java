package practise;

import java.util.*;

public class DTest {

    public void scnFunction(int[] intArray) {
        System.out.println("DTest");

//        int[] intArray = {5, 7, 8, 85, 13, 3, 7, 21, 10, 5, 3};

        ArrayList<Integer> intList = new ArrayList<Integer>();
//        LinkedList<String> LintList = new LinkedList<String>();

        for (int i = 0; i <= intArray.length - 1; i++) {

            if (intArray[i] % 2 != 0) {
                System.out.println(intArray[i]);
                intList.add(intArray[i]);
            }

        }
        System.out.println("List values" + intList.toString());

//        LinkedList<Integer> LintList = new LinkedList<Integer>(intList);

        HashSet<Integer> HintSet = new HashSet<Integer>(intList);

        System.out.println("List values after HashSet" + HintSet);

        ArrayList<Integer> intList2 = new ArrayList<Integer>(HintSet);

        Collections.sort(intList2);

        System.out.println("intlist2 final" + intList2);

//        Object intarray2[] = intList.toArray();
//
//        for (int i = 0; i <= intarray2.length - 1; i++) {
//
//            for (int j = i + 1; j <= intarray2.length - 1; j++) {
//
//                if (intarray2[i] == intarray2[j]) {
//                    intarray2[j] = 0;
//                }
//
//            }
//
//            System.out.println("intarray2[i] after removing duplicates" + intarray2[i]);
//
//        }
//
//        intList.clear();
//
//        for (int i = 0; i <= intarray2.length - 1; i++) {
//            System.out.println("intarray2[i] -->" + intarray2[i]);
//
//            if (!intarray2[i].equals(0)) {
//                intList.add(Integer.valueOf(intarray2[i].toString()));
//            }
//        }
//
//        System.out.println("intlist after removing zeros" + intList);
//
//        Collections.sort(intList);
//
//        System.out.println("intlist final" + intList);

    }


    public static void main(String args[]) {
        System.out.println("intlist final Function");

        DTest dt = new DTest();
//        int[] intArray = {5, 7, 8, 85, 13, 3, 7, 21, 10, 5, 3};
        Scanner scn = new Scanner(System.in);
        int[] intArray =   new int[11];
for (int i =0; i<=intArray.length-1;i++)
{

    System.out.println("Enter Number"+i+"--");

    intArray[i]= scn.nextInt();
}
        dt.scnFunction(intArray);

    }
}
