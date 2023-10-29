package InternalJavaPGMS;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatOctNew {
    public static void main(String[] args)
    {
        System.out.println("DateFormatter");

        Date date = new Date();
        System.out.println("Before Format"+date);

        SimpleDateFormat SDF = new SimpleDateFormat("MM/dd/yyyy hh/mm/ss");
//        SDF.format(date);
        System.out.println("After Format"+SDF.format(date));

    }
}
