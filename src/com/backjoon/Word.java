package com.backjoon;

import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alphabet = scanner.next();
        Map<String, Integer> store = new HashMap<>();
        for (int i = 0; i < alphabet.length(); i++) {
            String curChar = Character.toString(alphabet.charAt(i)).toUpperCase();
            store.merge(curChar, 1, Integer::sum);
        }

        String maxChar = null;
        int maxCnt = 0;
        boolean isDuplicate = false;
        for (String key: store.keySet()) {
            System.out.println(key + ":" + store.get(key));
            if (store.get(key) > maxCnt) {
                maxCnt = store.get(key);
                maxChar = key;
                isDuplicate = false;
            } else if (store.get(key).equals(maxCnt)) {
                isDuplicate = true;
            }
        }
        if (isDuplicate)
            System.out.println("?");
        else
            System.out.println(maxChar);
    }
}
