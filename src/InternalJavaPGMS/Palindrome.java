package InternalJavaPGMS;

public class Palindrome {

    public static void main(String[] args) {

        String str = "1111111111111111111";
        String reverstr = "";

        char[] str2 = new char[10];
        str2 = str.toCharArray();

        for (int i=str2.length-1; i>=0 ;i--){

            reverstr = reverstr+ str2[i];

        }

        System.out.println(str);
        System.out.println(reverstr);

        if (str.toLowerCase().equals(reverstr.toLowerCase())){
            
            System.out.println("String is a InternalJavaPGMS.Palindrome");

        }else{
            System.out.println("Not a InternalJavaPGMS.Palindrome");
        }

    }
}
