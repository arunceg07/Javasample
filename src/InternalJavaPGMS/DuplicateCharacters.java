package InternalJavaPGMS;

public class DuplicateCharacters {

    public static void main(String args[]){

        System.out.println("Test");

        int count=0;

        String str = "automation";
        char [] strarray = new char[str.length()-1];
        strarray = str.toCharArray();
       for (int i=0;i<=str.length()-1;i++){
//           System.out.println(str.charAt(i));

           for (int j=i+1;j<=str.length()-1;j++){
               if (strarray[i]==strarray[j]){
                   System.out.println(strarray[i]);
//                   count++;
//
//                   if (count>2){
//                       System.out.println(strarray[i]);
//                       break;
//                   }
               }
           }
       }

        System.out.println("");

    }
}
