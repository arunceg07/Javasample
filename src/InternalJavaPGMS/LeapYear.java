package InternalJavaPGMS;

public class LeapYear {
    public static void main(String args[]) {
        int yearToTest=30000;
        if (yearToTest%10==0)
        {
            if (yearToTest%400==0)
            {
                System.out.println("Century Leap Year");
            }
        }else if (yearToTest%4==0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}
