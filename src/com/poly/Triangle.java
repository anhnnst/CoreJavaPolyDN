/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

public class Triangle extends AbstractSharp 
        implements ISharp{

    @Override
    public void draw() {
        System.out.println("Draw a Triangle");
    }

    @Override
    public void moveTo(int x, int y) {
        System.out.println("Move to ");
    }
    
}
