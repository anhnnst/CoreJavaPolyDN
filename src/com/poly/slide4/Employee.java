/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.slide4;

public class Employee {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException{
        if (age < 0 || age>200)
            throw new InvalidAgeException("Invalid age data");
        this.age = age;
    }
}
