package com.backjoon;

import java.util.*;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alphabets = sc.nextLine().split("");
        Map<String, Integer> map = new HashMap<>();

        for (String alphabet : alphabets) {
            String curAlpha = alphabet.toUpperCase(Locale.ROOT);
            map.merge(curAlpha, 1, Integer::sum);
        }

        List<Map.Entry<String, Integer>> list_entries = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        list_entries.sort((obj1, obj2) -> obj2.getValue().compareTo(obj1.getValue()));

        if (list_entries.size() > 2 && list_entries.get(0).getValue().equals(list_entries.get(1).getValue())) {
            System.out.println("?");
        } else {
            System.out.println(list_entries.get(0).getKey());
        }
    }
}
