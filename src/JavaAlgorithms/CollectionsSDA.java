package JavaAlgorithms;

// This program is demonstration of Collections from SDA classes
//
// Revisited at 2020-01

import java.util.*;
import java.util.Arrays;

public class CollectionsSDA {

    public static void main(String[] args){

        int[] arrayOfInts = new int[5];
        List<Integer> listOfInts1 = new ArrayList<>();
        List<Integer> listOfInts2 = new LinkedList<>();
        Set<Integer> setOfInts = new HashSet<>();

        Random rnd = new Random();

        System.out.println("Array List ");
        for(int i = 0; i<25; i++){
            listOfInts1.add(rnd.nextInt(100));
            System.out.println("Size: " + listOfInts1.size());
        }

        System.out.println("\nLinked List");
        for(int i = 0; i<25; i++){
            listOfInts2.add(rnd.nextInt(100));
            System.out.println("Size: " + listOfInts2.size());
        }

        System.out.println("\nSet");
        for(int i = 0; i<25; i++){
            setOfInts.add(rnd.nextInt(100));
            System.out.println("Size: " + setOfInts.size());
        }

        System.out.println("\nMap");
        Map<String, Integer> translate = new HashMap<>();
        translate.put("one", 1);
        translate.put("two", 2);
        translate.put("three", 3);
        System.out.println(translate.get("two"));

        Map<String, List<String>> synonyms = new HashMap<>();
        synonyms.put("flower", Arrays.asList("herb", "vine", "floret"));

        System.out.println(synonyms.getOrDefault("flower", Arrays.asList()));
        System.out.println(synonyms.getOrDefault("grass", Arrays.asList()));

        for(Map.Entry<String, List<String>> pair : synonyms.entrySet()){
            System.out.println(pair);
        }

    }

}
