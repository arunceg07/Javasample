package InternalJavaPGMS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FirstLetterCaptial {

    public static void main(String[] args) {
        System.out.println("to print first letter of word in a sentence in capital");
//
        String str = "to print first letter of word in a sentence in capital";
////        String str = "automation";
//        char[] charArray = str.toCharArray();
//        String firstcharacter = String.valueOf(charArray[0]).toUpperCase();
//        String concat = "";
//
//        for (int i = 1; i <= charArray.length - 1; i++) {
////            String.valueOf(charArray[i]).toUpperCase();
////            System.out.println(String.valueOf(charArray[i]));
//            concat = concat + String.valueOf(charArray[i]);
//
//        }
//        System.out.println(firstcharacter + concat);
        String[] strArray = str.split(" ");
        String[] strArray1;
        strArray1 = new String[strArray.length];
        for (int j = 0; j <= strArray.length - 1; j++) {

            char[] charArray = strArray[j].toCharArray();
            String firstcharacter = String.valueOf(charArray[0]).toUpperCase();
            String concat = "";

            for (int i = 1; i <= charArray.length - 1; i++) {
                concat = concat + String.valueOf(charArray[i]);

            }
//            System.out.print(firstcharacter + concat);
            strArray1 [j] = firstcharacter+concat;
        }

//        for (int k = 0; k <= strArray1.length - 1; k++) {
//                        System.out.print(strArray1[k]);
//        }

        ArrayList<String> strList = new ArrayList<String>();

        for (int k = 0; k <= strArray1.length - 1; k++) {
            strList.add(strArray1[k]);
            strList.add(" ");
        }
        Iterator it = strList.iterator();
        for (String i:strList) {
            System.out.print(i);
        }


    }
}

