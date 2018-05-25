/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.ex4;

public class SinhVienBiz extends SinhVienPoly{
    public double diemMarketing, diemSale;
    
    public SinhVienBiz(String hoTen, 
            double diemMarketing, double diemSale){
        super(hoTen, "Biz");
        
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }
    
    public double getDiem(){
        return (diemMarketing + diemSale) /2;
    }
}
