package org.example;

import java.util.*;

public class Main {
    public static void printOdds(List<Integer> list) {
        for (Integer i : list) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void printEvens(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                set.add(i);
            }
        }
        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        System.out.println(result);
    }

    public static void onlyUnique(List<String> list) {
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }

    public static void counter(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (Integer i : map.values()) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(10, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOdds(nums);
        printEvens(nums);

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        onlyUnique(strings);
        counter(strings);

    }
}