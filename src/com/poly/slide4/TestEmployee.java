/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.slide4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestEmployee {
    public static void main(String[] args){
        try {
            Employee emp1 = new Employee();
            emp1.setAge(-20);
            emp1.setAge(10);
        } catch (InvalidAgeException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}








