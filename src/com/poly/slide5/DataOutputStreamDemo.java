/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.slide5;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author AnhNN
 */
public class DataOutputStreamDemo {
    public static void main(String[] args) {
        Student student = new Student();
        
        student.setStudentId("ST01");
        student.setName("AnhNN");
        
        try(
                ObjectOutputStream dout = new ObjectOutputStream(
                        new FileOutputStream("e:/Students.dat")
                    );
            ){
            dout.writeObject(student);
            System.out.println("Completely!");
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
