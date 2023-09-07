package InternalJavaPGMS;

public class AllSubsetsofString {

    public static void main(String args[]){

        String str = "FUN";

//        str.substring(0,1);

        int len = str.length();
        int temp = 0;

        String [] subsetsArray = new String[len*(len+1)/2];

        for (int i=0; i<=len-1; i++)
        {
            for (int j=i; j<=len-1; j++)
            {
                subsetsArray [temp] = str.substring(i,j+1);
                temp++;
            }
        }

        for (int i=0; i<=subsetsArray.length-1; i++)
        {
            System.out.println(subsetsArray[i]);
        }



    }
}
