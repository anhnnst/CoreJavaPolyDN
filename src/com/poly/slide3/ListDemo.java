/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.slide3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt()% 200);
        }
        System.out.println("List: " + list.toString());
        
        for (int i = 0; i < 10; i++) {
            System.out.print("  " + list.get(i));
        }
        System.out.println("\n--------------------");
        for (Integer elem : list) {
            System.out.print("  " + elem );
        }
        System.out.println("\n--------------------");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            Integer item = it.next();
            System.out.print("   " + item);
        }
        
//        list.add(200);
//        list.add(300);
//        list.add(100);
//        System.out.println("Elements of List: " + list.toString());
//        Integer first = list.get(0);
//        System.out.println("First element: " + first);
    }
}
