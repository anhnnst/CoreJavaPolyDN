/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.slide6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberRender extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print("  " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) { }
        }
    }
    
}
