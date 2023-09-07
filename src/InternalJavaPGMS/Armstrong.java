package InternalJavaPGMS;

import java.util.ArrayList;
import java.util.Collections;

public class Armstrong {

    public static void main(String args[]) {

        System.out.println("Test");

        int armNum = 1634;
        int armMod = armNum;
        int armNumFinal = armNum;
        int count = 0;
        double result = 0;

        ArrayList<Integer> intArray = new ArrayList<Integer>();

        for (int i = 0; armNum != 0; i++) {
            armMod = armNum % 10;
            armNum = armNum / 10;
            count++;
//            System.out.println(armMod);
            intArray.add(armMod);

        }

        for (int i =0; i<=intArray.size()-1;i++) {
            result = result + Math.pow(intArray.get(i), count);
            }
//        System.out.println("result"+result);

        int resultRoundoff = (int)result;

//        System.out.println("resultRoundoff"+resultRoundoff);
//        System.out.println("armNum"+armNumFinal);

        if (armNumFinal==resultRoundoff){
            System.out.println("Number is an InternalJavaPGMS.Armstrong Number");
        }else{
            System.out.println("Number is Not an InternalJavaPGMS.Armstrong Number");
        }
    }
}
