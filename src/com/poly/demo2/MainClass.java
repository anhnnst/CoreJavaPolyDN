/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.demo2;

public class MainClass {
    public static void main(String[] args) {
        AbstractSharp sharp = new Square();
        
        sharp.draw();
        
        sharp = new Triangle();
        
        sharp.draw();
    }
}
