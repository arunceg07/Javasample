package InternalJavaPGMS;

public class CharacterAlphabetorNot {
    public static void main(String args[]) {
        char ch = '*';

        if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
            System.out.println("Character is an alphabet");
        }else {
            System.out.println("Character is not an alphabet");
        }
    }
}
