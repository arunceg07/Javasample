package FTPGMS;

public class Test1 {

    public void noofZeros( String Number)
    {
        System.out.println("No of zeros");

//        String Number = "1001000222";
        int count = 0;

        for (int i =0; i<=Number.length()-1; i++){
            if (Number.charAt(i)=='0')
            {
                count++;
            }

        }
//        System.out.println("count of zeros--"+ count);

    }
public static void main(String[] args){

    Test1 noz = new Test1();
//    noz.noofZeros("100");

    for (int i =1;i<=110;i++ )
    {
        noz.noofZeros(Integer.toString(i));
    }



}
}
