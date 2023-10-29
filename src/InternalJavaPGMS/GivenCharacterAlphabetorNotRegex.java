package InternalJavaPGMS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GivenCharacterAlphabetorNotRegex {
    public static void main(String[] args) {
        char ch = '1';

//        if((ch>='a'&& ch<='z') || (ch>='A'&& ch<='Z'))
//        {
//            System.out.println("Character is an Alphabet");
//        }else
//            System.out.println("Character is Not an Alphabet");

        Pattern p = Pattern.compile("[a-z,A-Z]", Pattern.CASE_INSENSITIVE);
        Matcher mr = p.matcher(String.valueOf(ch));
        boolean res = mr.find();

        if (res) {
            System.out.println("Character is an Alphabet");
        } else
            System.out.println("Character is Not an Alphabet");
    }
}




