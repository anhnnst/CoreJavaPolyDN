/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.demo2;

public class Sharp {
    public int x, y;
    protected String color;
    private void init(){
        x = y = 0;
        color = "red";
    }
    public void draw(){
        System.out.println("Draw a sharp");
    }
}
