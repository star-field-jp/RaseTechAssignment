package com.starfield;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        //例外(IndexOutOfBoundsException)を追加
        list.set(3, 4);

        System.out.println(list);

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("orange", 2);
        map.put("melon", 3);

        System.out.println(map);

        List<String> list2 = new ArrayList<>(map.keySet());

        System.out.println(list2);

    }
}