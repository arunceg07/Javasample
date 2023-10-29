package InternalJavaPGMS;
public class AverageusingArraysoctnew {
    public static void main(String[] args)
    {
        System.out.println("Average of numbers in an Array");

        int [] intArray = {1,2,-45,65,78,97,12,54,23};
        int ressum=0;
        for(int i =0; i<=intArray.length-1; i++)
        {
            ressum = ressum+intArray[i];
        }

        System.out.println(ressum/intArray.length-1);
    }
}

