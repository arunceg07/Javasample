package InternalJavaPGMS;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoofZeroswithRegex {

    public int noofZerosregexfxn(int num)
    {
//        int num = 1102003000;

        String intNumStr = String.valueOf(num);
        int count =0;
        for (int i =0; i<=intNumStr.length()-1;i++)
        {
            Pattern p = Pattern.compile("[0]", Pattern.CASE_INSENSITIVE);
            Matcher mr = p.matcher(String.valueOf(intNumStr.charAt(i)));
            boolean res = mr.find();
//            System.out.println(res);
            if (res)
                count++;
        }

//        System.out.println(count);
        return count;
    }
    public static void main(String[] args)
    {
        System.out.println("No of Zeros using regex");
        NoofZeroswithRegex nregex = new NoofZeroswithRegex();
//        nregex.noofZerosregexfxn(1002003000);
        int finalsum =0;

        for (int j =0; j<=110; j++)
        {
            finalsum = finalsum+ nregex.noofZerosregexfxn(j);
        }
        System.out.println("FinalCount using regex: "+finalsum);
    }
}
