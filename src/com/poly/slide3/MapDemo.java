/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.slide3;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        
        students.put("ST01", "Hung");
        students.put("ST02", "Minh");
        students.put("ST03", "Tien");
        System.out.println(students.toString());
        
        for (Map.Entry<String, String> entry : students.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println(key + " = " + value);
        }
    }
}
