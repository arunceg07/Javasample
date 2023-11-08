package InternalJavaPGMS;

public class Lambdaexp_noparameter {

    public interface funI {

       public int messageDouble();
    }

    public static void main(String [] args)
    {

        System.out.println("Test");

        funI ref;

        // lambda expression
        ref = () -> {
            return 3;
        } ;

        System.out.println("Value of Pi = " + ref.messageDouble());


    }
}
