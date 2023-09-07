package practise;

public class RepeatedWordsPrintOnlyOnce {

    public static void main(String[] args)
    {
    String str = "automationannnnntttttt";
    char [] charArray1 = str.toCharArray();
    int count;

    for (int i =0;i<=str.length()-1; i++)
    {
        count=1;
        for (int j =i+1;j<=str.length()-1; j++)
        {
            if (charArray1[i]==charArray1[j])
            {
                count++;
                charArray1[j]='0';
//                System.out.println(count);
            }
        }

        if (count>1 && charArray1[i]!='0')
        {
            System.out.println(charArray1[i]);
            System.out.println(count);
        }

    }

//    System.out.println(count);
}
}