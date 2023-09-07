package InternalJavaPGMS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConvertHashmaptoList {

public static void main(String args[])
{
    HashMap<String, String> mapToList = new HashMap<String, String>();
    mapToList.put("name","Arun Kumar");
    mapToList.put("class","Electrical");
    mapToList.put("college","anna university");

//    // Print using Entry Set
//
//    Iterator entrysetIT =  mapToList.entrySet().iterator();
//    while (entrysetIT.hasNext())
//    {
//        System.out.println(entrysetIT.next());
//    }

//    // Print using Key Set
//
//    Iterator KeysetIT =  mapToList.keySet().iterator();
//    while (KeysetIT.hasNext())
//    {
//        System.out.println(KeysetIT.next());
//    }

//    // Print using Value Set
//
//    Iterator ValuesetIT =  mapToList.values().iterator();
//    while (ValuesetIT.hasNext())
//    {
//        System.out.println(ValuesetIT.next());
//    }

//    ArrayList<String> valuesList = new ArrayList<String>(mapToList.values());
//    ArrayList<String> KeyList = new ArrayList<String>(mapToList.keySet());
//
//
//
////        System.out.println("valuesList--"+valuesList);
//
//        for (int j=0; j<=valuesList.size()-1;j++)
//        {
////            System.out.println("valuesList--"+valuesList.get(j));
//            System.out.println("KeyList--"+KeyList.get(j));
//        }


//    System.out.println(mapToList.get("name"));
//    System.out.println(mapToList.put("name", "Kumar"));
//    System.out.println(mapToList.get("name"));


    mapToList.forEach((key, value) -> {

        if (value.equalsIgnoreCase("Electrical"))
        {
            System.out.println(key);
        }

    });


}
}
