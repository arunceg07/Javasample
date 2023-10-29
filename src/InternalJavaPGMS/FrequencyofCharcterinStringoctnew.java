import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrequencyofCharcterinStringoctnew {

    public static void main(String[] args) {
        String str = "automation automation is automation a String automation";
        String[] strArray =  str.split(" ");
        int count=0;

//        for (int i = 0; i < strArray.length-1; i++)
//        {
//
//        if (strArray[i].equalsIgnoreCase("automation"))
//        {
//            count++;
//        }
//
//        }

        //using regex
        Pattern pa = Pattern.compile("a");
        Matcher match = pa.matcher(str);
//        boolean res = match.find();
        for (int i =0; i<= strArray.length-1; i++)
        {
            boolean res = match.find();
            if (res)
                count++;
        }

        System.out.println(count);
    }
}
