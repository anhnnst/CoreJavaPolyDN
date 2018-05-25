
package com.poly;

public class Circle extends Sharp{
    public int radius;
    
    public Circle(){
        super();
        
        System.out.println("Circle Constructor");
    }
    public void draw(){
        System.out.println("Draw a circle");
        
        super.draw();
    }
}
