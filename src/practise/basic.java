package practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class basic {

    public static void main(String args[]) {
        String str = "my name is arun";

        ArrayList<Character> List1 = new ArrayList<Character>();
//        System.out.print(str);




        // ym emaN si nura

        for (int i = str.length()-1; i>=0; i--){
//            System.out.print(str.charAt(i));

//            strarray[i] = String.valueOf(str.charAt(i));
            List1.add(str.charAt(i));
        }

//        for (char a: List1 )
//        {
//            System.out.print(a);
//        }

        for (int i = List1.size()-1; i>=0; i--){
            System.out.print(List1.get(i));
        }

//        System.out.print(strarray);


//        set1.descendingSet();
//
//        System.out.print(set1.descendingSet());

    }
}
