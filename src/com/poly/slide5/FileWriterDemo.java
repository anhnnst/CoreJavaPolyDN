/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.slide5;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        String fileName = "e:/text.txt";
        
        try(FileWriter fw = new FileWriter(fileName)){
            
            fw.write("Hello world!\n");
            fw.write("This is a text file");
            for (int i = 0; i < 10; i++) {
                fw.write("Line " + i);
            }
            System.out.println("Completely!");
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
