package hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ItineraryTickets {
    public static void findRoot(String[] arr1, String[] arr2) {
        Map<String, String> fromTo = new HashMap<>();
        Map<String, String> toFrom = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            fromTo.put(arr1[i], arr2[i]);
            toFrom.put(arr2[i], arr1[i]);
        }

        String start = "";
//        Set<String> keys = fromTo.keySet();
        for (String key : fromTo.keySet()) {
            if (!toFrom.containsKey(key)) {
                start = key;
            }
        }

        System.out.print(start);
        for (String key : fromTo.keySet()) {
            System.out.print(" --> " + fromTo.get(start));
            start = fromTo.get(start);
        }

//        LinkedHashMap<String, String> result = new LinkedHashMap<>();
//
//        for (int i = 0; i < fromTo.size(); i++) {
//            result.put(start, fromTo.get(start));
//            start = fromTo.get(start);
//        }
//
//        return result;

    }

    public static void main(String[] args) {
        String[] arr1 = { "C", "M", "G", "D" };
        String[] arr2 = { "B", "D", "C", "G" };
//        LinkedHashMap<String, String> result = findRoot(arr1, arr2);
        findRoot(arr1, arr2);

//        for (Map.Entry<String, String> entry : result.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
    }
}
