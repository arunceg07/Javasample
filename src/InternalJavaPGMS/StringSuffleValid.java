package InternalJavaPGMS;
import java.util.Arrays;

public class StringSuffleValid {

    public static void main(String[] args)
    {
        System.out.println("String suffle valid or Not");

        String str1 = "YXZ";
        String str2 = "12";
        String Test = "1X2ZY";

        String finalstr = str1+str2;
        System.out.println("String Final to be compared: "+ finalstr);

        char[] charArray = finalstr.toCharArray();
        Arrays.sort(charArray);
        char[] charArray1 = Test.toCharArray();
        Arrays.sort(charArray1);

        System.out.println("finalstr Array after Sorting");
        for (char ch:charArray) {
            System.out.println(ch);
        }
        System.out.println("Test Array after Sorting");
        for (char ch:charArray1) {
            System.out.println(ch);
        }

        boolean res= Arrays.equals(charArray, charArray1);
        if (res)
            System.out.println("Valid Suffle");
        else
            System.out.println("Invalid Suffle");

    }
}

