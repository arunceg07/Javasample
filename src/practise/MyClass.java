package practise;

import java.util.Scanner;

public class MyClass {

    public static void primenumfunctionscn(int num) {
//        int num = 2;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
//        System.out.println(count + "-count");
        if (count == 2 && num > 1) {
            System.out.println(num);
        }
    }

    public static void main(String args[]) {
        System.out.println("*******Welcome to Prime Number Software*******");
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the Range in which Prime Numbers should be Printed");
        System.out.println("Input the Start Limit");
        int StartRange =  scn.nextInt();
        System.out.println("Enter the End Limit");
      int EndRange =  scn.nextInt();
        System.out.println("Please find the prime Numbers between "+StartRange+" and "+EndRange+" below");
        for (int j=StartRange; j<=EndRange; j++)
        {
            MyClass.primenumfunctionscn(j);
        }

    }
}
