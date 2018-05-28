
package com.poly.slide3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //Set<Integer> list = new HashSet<>();
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(30);
        System.out.println("Elements: " + list.toString());
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print("  " + list.get(i));
        }
        System.out.println("\n--------------------");
        for (Integer item : list) {
            System.out.println("   " + item);
        }
        System.out.println("\n--------------------");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            Integer item = it.next();
            System.out.print("  " + item);
        }
        System.out.println("\n--------------------");
        list.forEach(item -> System.out.println("  " + item));
    }
}
