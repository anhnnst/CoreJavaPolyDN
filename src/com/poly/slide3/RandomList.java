/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.slide3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class RandomList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(30));
        }
        System.out.println("" + list.toString());
        Collections.sort(list, (a,b)-> a - b);
        System.out.println("" + list.toString());
        
        Collections.sort(list, (a,b)-> b - a);
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        System.out.println("" + list.toString());
    }
}
