package Collections.Map.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {

        // Map stores element in the form of key value pair & Map doesn't allow duplicate keys
        //Map are not threadsafe but hashtable is
        //Hashmap is Unordered
        Map<String, String> hMap = new HashMap();
        hMap.put("Name", "Swati");
        hMap.put("City", "Jhansi");


        for (Map.Entry<String, String> item : hMap.entrySet()) {

            System.out.println(item.getKey() + ":" + item.getValue());

        }

        //LinkedHash Map is Ordered i.e as added by user
        Map<String, String> linkedhashMap = new LinkedHashMap<>();
        linkedhashMap.put("Name", "Swati");
        linkedhashMap.put("City", "Jhansi");


        for (Map.Entry<String, String> item : linkedhashMap.entrySet()) {

            System.out.println(item.getKey() + ":" + item.getValue());

        }

        // Sorted items
        //No null key is allowed
        Map<String, String> treeMap = new TreeMap<>();
        linkedhashMap.put("Name", "Swati");
        linkedhashMap.put("City", "Jhansi");


        for (Map.Entry<String, String> item : linkedhashMap.entrySet()) {

            System.out.println(item.getKey() + ":" + item.getValue());

        }


    }
}
