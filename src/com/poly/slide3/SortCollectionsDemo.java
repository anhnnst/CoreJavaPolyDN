/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.slide3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author AnhNN
 */
public class SortCollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(7);
        
        System.out.println(list.toString());
        Collections.sort(list, (a,b) -> a - b);
        System.out.println(list.toString());
        Collections.sort(list, (a,b) -> b - a);//Lambda expression
        System.out.println(list.toString());
    }
}
