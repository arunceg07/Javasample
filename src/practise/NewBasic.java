package practise;

import java.util.ArrayList;

public class NewBasic {

    public static void main(String args[]) {
        String str = "my name is arun";

       String [] strarray1 =  str.split(" ");

        ArrayList<String> List1 = new ArrayList<String>();

        String [] strarray2 = new String[str.length()];

        for (int i =0; i<=strarray1.length-1;i++)
        {
//            System.out.print(strarray1[i]+" ");

            List1.add(strarray1[i]);
            if (i==strarray1.length-1)
            {
                break;
            }
            List1.add(" ");

        }


//            System.out.print(List1);

        for (int i =0; i<=List1.size()-1;i++)
        {
         strarray2 [i] = List1.get(i).toString();

//            System.out.print(List1.get(i).toString());
        }

//        for (int i =0; i<=strarray2.length-1;i++)
//        {
//
//            System.out.print(strarray2[i]);
//
//        }



//        System.out.print(String.valueOf(strarray2));

        for (int i =0; i<=strarray2.length-1;i++)
        {
//            System.out.print(strarray1[i]+" ");

            if (strarray2[i]!=null) {

                for (int j = strarray2[i].toCharArray().length - 1; j >= 0; --j) {

                    System.out.print(strarray2[i].charAt(j));
                }
            }
        }

    }
}
