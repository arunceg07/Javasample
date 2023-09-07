package InternalJavaPGMS;

public class Fibonicci {
    public static void main(String args[]) {
        int range = 1000;
        int a =0;
        int b =1;
        int c =0;

        for (int i =1; a<=range;i++)
        {
            System.out.println(a);
            c= a+b;
            a=b;
            b=c;
//   System.out.println(c);

//            if (a>1000){
//                break;
//            }

        }
    }
}
