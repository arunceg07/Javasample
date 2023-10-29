package InternalJavaPGMS;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharctersinStringusingRegex {

    public static void main(String[] args)
    {
        //count special characters in a string

        String str = "A man, a plan*&, a canal – Panama";
        String str1 = str;

        String[] strArray =  str.split("[a-zA-Z0-9 ]"); // mention what needs to removed in String

        String specialStr = "";
//                  System.out.println(strArray.length);
        for (int i =0; i <= strArray.length-1; i++)
        {
            System.out.println(strArray[i]);
            specialStr = specialStr+strArray[i];
        }
        System.out.println(specialStr);
        System.out.println("No of Special characters in a string excluding spaces-->"+specialStr.length());

        // count spaces in a string using regex,

        String[] str1Array =  str1.split("[a-zA-Z0-9,*&–]");
//        System.out.println("count spaces in a string using regex"+str1Array.length);
        String specialStr1 = "";
//        System.out.println(str1Array.length);
        for (int i =0; i <= str1Array.length-1; i++)
        {
            System.out.println(str1Array[i]);
            specialStr1 = specialStr1+str1Array[i];
        }
        System.out.println(specialStr1);
        System.out.println("count spaces in a string using regex-->"+specialStr1.length());


        // count spaces in a string without Regex,

//                String[] str1Array =  str1.split("[a-zA-Z0-9,*&–]");

        int count =0;

        for (int i =0; i <= str1.length()-1; i++)
        {
            if (str1.charAt(i)==' ')
            {
                count++;
            }
        }

        System.out.println("No of Spaces in a string without regex-->"+count);

//        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
//       Matcher m = p.matcher(str);
//       boolean res = m.find();
//
//       System.out.println(res);
    }
}

