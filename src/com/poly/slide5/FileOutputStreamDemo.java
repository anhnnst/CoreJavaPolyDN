/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.slide5;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String fileName = "e:/atest.dt";
        FileOutputStream fout = null;
        try {
            fout= new FileOutputStream(fileName);
            byte[] data = "Hello world!\nHow are you today?".getBytes();
            fout.write(data);
            System.out.println("Data has been saved!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally{
            try {
                fout.close();
            } catch (Exception ex) {}
        }
    }
}
