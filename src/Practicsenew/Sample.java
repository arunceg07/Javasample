import java.util.*;
import java.io.*;

class Sample {

    public static String FirstReverse(String str) {
        //   // code goes here

//        String str = "I Love Code";
//       char [] charArray = str.toCharArray();
        String reversestr = " ";


        for (int i=str.length()-1; i>=0; i--)
        {
            reversestr = reversestr+ str.charAt(i);
        }

        return reversestr;
    }

    public static void main (String[] args) {
        // keep this function call here
         Scanner s = new Scanner(System.in);
         System.out.print(FirstReverse(s.nextLine()));



    }

}