package InternalJavaPGMS;

import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args){
        String str1 = "Brag", str2 = "Grab";
        int count =0;

       char [] charArray1 =  str1.toLowerCase().toCharArray();
       char [] charArray2 =  str2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

//        System.out.println("str1"+charArray1.toString());
//
//        System.out.println("str2"+charArray2.toString());


//        for (int i = 0; i<=charArray1.length-1; i++)
//        {
//            System.out.println("str1"+charArray1[i]);
//        }
//
//        for (int i = 0; i<=charArray2.length-1; i++)
//        {
//            System.out.println("str2"+charArray2[i]);
//        }

        if (Arrays.equals(charArray1,charArray2))
        {
            System.out.println("Anagram");
        }else
        {
            System.out.println("Not an Anagram");
        }


    }
}
