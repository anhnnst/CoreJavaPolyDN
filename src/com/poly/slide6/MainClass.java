/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.slide6;

/**
 *
 * @author AnhNN
 */
public class MainClass {
    public static void main(String[] args) {
//        NumberRender th1 = new NumberRender();
//        th1.start();
//        NumberRender th2 = new NumberRender();
//        th2.start();
//        NumberRender th3 = new NumberRender();
//        th3.start();
        NumberDisplayer th4Obj = new NumberDisplayer();
        Thread th4 = new Thread(th4Obj);
        th4.start();
        Thread th5 = new Thread(th4Obj);
        th5.start();
        

        System.out.println("Complete!");
    }
}
