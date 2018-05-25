
package com.poly.ex4;

public abstract class SinhVienPoly {
    public String hoTen, nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();
    
    public String getHocLuc(){
        if (getDiem()>5){
            return "Gioi";
        }
        return "Yeu";
    }
    public void xuat(){
        System.out.printf("\nHo ten: %s - Nganh: %s "
                + " - Diem: %f - Hoc Luc: %s",
                hoTen, nganh, getDiem(), getHocLuc());
    }
}
