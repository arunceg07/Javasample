package Intnew;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Sample {


    public static void main(String[] args)
    {
//        System.out.println("Hello world");
//        Integer arr [] = new Integer[]  {1,4,3,1,4,5,2,1,2};
//
//        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(arr));
//
//
//        TreeSet TS = new TreeSet(intList);
//        System.out.println(TS);

        int arr [] = {1,4,3,1,4,5,2,1,2};
        List<Integer> List = new ArrayList<>();
       int count;


        for (int i=0; i<=arr.length-1; i++)
        {
            count=1;
            for (int j=i+1; j<=arr.length-1; j++)
            {
                if (arr[i]==arr[j])
                {
                    arr[j]=0;
                    count++;
                }
            }
            if (arr[i]!=0)
            {
//                System.out.println(arr[i]);
                List.add(arr[i]);
            }
        }

        int arr1[] = List.stream().mapToInt(Number::intValue).toArray();
        int arr2[] = new int [arr1.length];
        int temp=0;
        for (int i=0; i<=arr1.length-1; i++) {

            for (int j=i+1; j<=arr1.length-1; j++) {
//            System.out.println(i);
                if (arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
            arr2[i]=arr1[i];
//            System.out.println(arr1[i]);

        }

        for (int i :arr2 ) {
            System.out.println(i);
        }


    }
}
