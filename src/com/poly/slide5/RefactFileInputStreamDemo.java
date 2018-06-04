/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.slide5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RefactFileInputStreamDemo {
    public static void main(String[] args) {
        String fileName = "e:/atest.dt";
        
        try (
                FileInputStream fin = new FileInputStream(fileName);
            ) {
            byte[] buffer = new byte[1024];//bo dem dung doc du lieu
            int length = 0; //dung luu so byte doc duoc vao buffer
            while ((length= fin.read(buffer))>0){
                String st = new String(buffer, 0, length);
                System.out.println("Read: " + st);
            }
            System.out.println("Completely!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
