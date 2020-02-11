package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 From Mindaugas repository

 This program:
    -

 Some Notes:
    - HashMap doesn’t allow duplicate keys but allows duplicate values.
    - HashMap allows null key also but only once and multiple null values.
 Created at 2020-02
 */

public class FilteringHashMap {
    public static void main(String[] args) {
        // filtering: get all countries,
        // where the capital name is longer than 8 symbols:

        Map<String, String> countriesWithCapitals = new HashMap<>();
        countriesWithCapitals.put("Poland", "Warsaw");
        countriesWithCapitals.put("Lithuania", "Vilnius");
        countriesWithCapitals.put("Monaco", "Monaco");
        countriesWithCapitals.put("Russia", "Moscow");
        countriesWithCapitals.put("United Kingdom", "London");
        countriesWithCapitals.put("Denmark", "Copenhagen");
        System.out.println("Before filtering: " + countriesWithCapitals);

        // 0. Traditional method
        List<String> countriesWithCapitalsLongerThat8 = new ArrayList<>();
        for (Map.Entry<String,String> countries : countriesWithCapitals.entrySet())
            if(countries.getValue().length() > 8)
                countriesWithCapitalsLongerThat8.add(countries.getKey());
        System.out.println("After filtering: " + countriesWithCapitalsLongerThat8);

        // 1. Stream API with Lambda expression
        List<String> countriesWithCapitalsLongerThat8WStreams = countriesWithCapitals
                .entrySet().stream()
                .filter(kv -> kv.getValue().length() > 8)
                .map(kv -> kv.getKey())
                .collect(Collectors.toList());
        System.out.println("After filtering (with streams): " + countriesWithCapitalsLongerThat8WStreams);
    }
}
