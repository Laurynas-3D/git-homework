package DataStructures;

import java.util.HashMap;
import java.util.Map;

/**
 This program:
    - illustrates Java.util.HashMap

 Some Notes:
    - HashMap doesn’t allow duplicate keys but allows duplicate values.
    - HashMap allows null key also but only once and multiple null values.
    - This class makes no guarantees as to the order of the map;
 Created at 2020-02
 */

public class HashMapTest {

    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();

        print(map);
        map.put("Trakai", 5_266 );
        map.put("Palanga", 15_381);
        map.put("Anykščiai", 10_575);

        System.out.println("Size of map is:- " + map.size());

        print(map);
        if (map.containsKey("Trakai")) {
            Integer a = map.get("Trakai");
            System.out.println("value for key" + " \"Trakai\" is:- " + a);
        }

        map.clear();
        print(map);
    }

    public static void print(Map<String, Integer> map){

        if (map.isEmpty()) {
            System.out.println("map is empty");
        }

        else {
            System.out.println(map);
        }
    }
}
