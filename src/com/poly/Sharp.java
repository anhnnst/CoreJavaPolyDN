
package com.poly;

public class Sharp {
    public int x, y;
    
    protected String color;
    
    public Sharp(){
        System.out.println("Sharp Constructor");
    }
    
    private void init(){
        x = y = 0;
        color = "red";
    }
    
    void draw(){
        System.out.println("Draw a sharp");
    }
}
