package InternalJavaPGMS;

import java.util.ArrayList;
import java.util.Arrays;

public class Solugenix_Req_ListTOArray {

    public static void main(String [] args)
    {
        String [] strArray = {"Ana","Brindha", "Abhishek","Alan","ketto"};

        ArrayList<String> strList = new ArrayList<>();

        for (int i=0; i<=strArray.length-1; i++)
        {

            if (strArray[i].charAt(0)=='A')
            {
                strList.add(strArray[i]);
            }

        }

        String [] strArray2 = new String[strList.size()];

        for (int i=0; i<=strList.size()-1; i++)
        {
            strArray2 [i] = (String) strList.get(i);
        }


        Arrays.sort(strArray2);

        for (int i=0; i<=strArray2.length-1; i++)
        {
            System.out.println(strArray2[i]);
        }

    }
}
