package InternalJavaPGMS;

public class RepeatedWord {

    public static void main(String args[]){



        String str = "The word has a word has called as duplicate word";
        int count;

        String str2 [] = str.split(" ");


        String str3 [] = str.split(" ");

        for (int i =0; i<=str2.length-1; i++)
        {
            count=1;
        for (int j =i+1; j<=str2.length-1; j++)
        {
            if (str2[i].equalsIgnoreCase(str2[j])){
                count++;
                str2[j] = "0";
            }

        }
            if (count>1)
            {
                System.out.println("str2[i]"+str2[i]);
            }


        }
    }
}
