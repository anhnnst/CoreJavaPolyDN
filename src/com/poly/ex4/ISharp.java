/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.ex4;

public interface ISharp {
    void draw();
}

class Rectangle implements ISharp{
    @Override
    public void draw() {
        System.out.println("Draw a rectangle");
    }
}
class MainClass2{
    public static void main(String[] args) {
        ISharp sh = new Rectangle();
        sh.draw();
        //ISharp sh2 = new ISharp();
        ISharp sh2 = new ISharp(){
            @Override
            public void draw() {
                System.out.println("Draw a Circle");
            }
        };
        sh2.draw();
    }
}
