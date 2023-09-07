package practise;

import java.util.*;

public class ReversingaStringWithoutchangingIndex {

    public static void main(String args[]){
        System.out.println("Reversing a string");

//        String str = "my name is arun";
        String str = "my name";
//     ym eman
//        Stack <String> strStack = new Stack<String>();
//
//        Queue<String> strQueue = new LinkedList<String>();
//
        ArrayList<String> strArrayList = new ArrayList<String>();

//        String [] strArray = new String[str.length()];

        for (int i =str.length()-1; i>=0; i--)
        {
//            System.out.println(str.charAt(i));
//            strStack.add(String.valueOf(str.charAt(i)));
//            strQueue.add(String.valueOf(str.charAt(i)));
            strArrayList.add(String.valueOf(str.charAt(i)));
        }

//        System.out.println("Stack Printing");
//        System.out.println(strStack);


//        System.out.println("Qeue Printing");
//        System.out.println(strQueue);

        System.out.println("ArrayList Printing");
        System.out.println(strArrayList);
//        Collections.reverse(strArrayList);
//
//        System.out.println(strArrayList);



    }
}
