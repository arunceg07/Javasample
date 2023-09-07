package InternalJavaPGMS;

public class Swap {
    public static void main(String args[]) {
        int x = 10;
        int y = 25;
        int temp = 0;

        //   temp = y;
        //   y =x;
        //   x = temp;

        x = x - y;
        y = x + y;
        x = y - x;

        System.out.println("x:--" + x + "--Y:--" + y);
    }
}
