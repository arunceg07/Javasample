package InternalJavaPGMS;

public class noofZerosinrangeofNumbers {

    public int zerosinaNumber(String str){
        // String str = "1211331";
        int count =0;
        for (int i=0; i<=str.length()-1; i++)
        {
// System.out.println(str.charAt(i));
            if (str.charAt(i)=='0'){
                count++;
            }

        }
        if (count>0)
        {
            // System.out.println("String:--"+str+"Count:--"+count);
        }
        return count;
    }

    public static void main(String args[]) {

        int rescount1=0;
        noofZerosinrangeofNumbers mcn = new noofZerosinrangeofNumbers();

        for (int i =0; i<=120; i++)
        {
            int resultCount = mcn.zerosinaNumber(Integer.toString(i));
            // System.out.println("resultCount--"+resultCount);

            rescount1 = rescount1+resultCount;
        }
        System.out.println("TotalresultCount--"+rescount1);

//  mcn.zerosinaNumber("1000002");


    }
}
