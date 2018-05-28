
package com.poly.slide3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        
        students.put("P01", "Hung");
        students.put("P02", "Minh");
        students.put("P03", "Thanh");
        students.put("P04", "Ha");
        
        for (Map.Entry<String, String> entry : students.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
