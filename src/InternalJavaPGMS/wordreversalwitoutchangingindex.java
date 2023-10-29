package InternalJavaPGMS;
import java.util.ArrayList;

public class wordreversalwitoutchangingindex {
    public static void main(String[] args)
    {
        System.out.println("word reversal in a sentence without changing index");

        String str = "word reversal in a sentence without changing index";

        String reverseStr = "";

        String[] stringArray = str.split(" ");

        ArrayList<String> stringList = new ArrayList<>();

        for (int i=0; i<=stringArray.length-1; i++)
        {
            stringList.add(stringArray[i]);
            stringList.add(" ");
        }

        for (int j=0; j<=stringList.size()-1; j++) {

            for (int i = stringList.get(j).length()-1; i >= 0; i--) {
                reverseStr = reverseStr+stringList.get(j).charAt(i);
            }

        }
        System.out.print(reverseStr);

    }
}

