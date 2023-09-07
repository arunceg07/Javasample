package InternalJavaPGMS;

public class GreatestandLowestGCD {
    public static void main(String args[]) {
        int n1 = 81;
        int n2 = 153;

        int gcd =1;
        int count =0;
        for (int i=1; i<=n1 && i<=n2; i++)
        {
            if (n1%i==0 && n2%i==0){
                gcd= i;
                count++;
            }
            // To find Lowest GCD use below,
//            if (count ==1){
//                break;
//            }
        }
        System.out.println("Highest GCD--"+gcd);
    }
}
