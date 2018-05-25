/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.ex4;

public class Number {
    public static float PI = 3.14f;
    
    public int x = 5;
}
class MainClass3{
    public static void main(String[] args) {
        Number obj = new Number();
        
        obj.x = 7;
        float f = Number.PI ;
    }
}
