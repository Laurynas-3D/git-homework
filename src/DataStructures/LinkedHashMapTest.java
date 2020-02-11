package DataStructures;

import java.util.*;

/**
 This program:
 - demonstrate working of LinkedHashMap

 Some Notes:
 - LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted into it.

 Created at 2020-02
 */

public class LinkedHashMapTest {

    public static void main(String[] args){

        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("Pirmas", "Lentvaris");
        lhm.put("Antras", "Molėtai");
        lhm.put("Trečias", "Rietavas");
        lhm.put("Ketvirtas", "Kupiškis");
        lhm.put("Penktas", "Kudirkos Naumiestis");

        // It prints the elements in same order
        // as they were inserted
        System.out.println(lhm);

        System.out.println("Getting value for key 'Pirmas': " + lhm.get("Pirmas"));
        System.out.println("Size of the map: " + lhm.size());
        System.out.println("Is map empty? " + lhm.isEmpty());
        System.out.println("Contains key 'Antras'? "+ lhm.containsKey("Antras"));
        System.out.println("Contains key 'antras'? "+ lhm.containsKey("Antras"));
        System.out.println("Contains value 'Kudirkos " + "Naumiestis'? "+ lhm.containsValue("Kudirkos "+ "Naumiestis"));
        System.out.println("delete element 'Pirmas': " + lhm.remove("Pirmas"));
        System.out.println(lhm);
    }
}
