package InternalJavaPGMS;

public class Lambda_multiplearg {

    interface funInt{
        String reverse(String str);
    }

    public static void main(String[] args)
    {
        funInt fi = (str)-> {

            String reverse = "";

            for (int i =str.length()-1; i>=0;i--)
            {
                reverse = reverse+ str.charAt(i);

            }

            return reverse;

        };

        System.out.println(fi.reverse("Arun"));
    }
}
