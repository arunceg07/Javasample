package InternalJavaPGMS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lambda_Map_List {

    public static void main(String[] args)
    {

        HashMap<Integer, String> mapL = new HashMap<>();
        mapL.put(1, "India");
        mapL.put(2, "UK");
        mapL.put(3, "USA");
        mapL.put(4, "Germany");

        mapL.forEach(
                (key, value)-> {
                    System.out.println("The Key is: "+key+ "and the Value is: "+value );
                }
        );


        List<String> listLambda = new ArrayList<>();

        listLambda.add("Arun");
        listLambda.add("Kumar");
        listLambda.add("Devarajan");
        listLambda.add("lakshmi");

        listLambda.forEach((str)->{

            System.out.println("List names: "+str);
        });

    }
}
