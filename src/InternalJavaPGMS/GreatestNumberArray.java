package InternalJavaPGMS;

public class GreatestNumberArray {

    public static void main(String args[]){
        System.out.println("Test");
        int [] numArray = {10, 20, 90, 40,50,60,3};
        int greatestnumber =0;

        for (int i=0; i<=numArray.length-1;i++){
       if (numArray[i]>greatestnumber){
           greatestnumber = numArray[i];
       }
        }

        System.out.println("greatestnumber--"+greatestnumber);
    }
}
