/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.lab2;

public abstract class Employee {
    public String fullName;
    
    public Employee(String fullName){
        this.fullName = fullName;
    }
    public abstract double getSalary();
    public void print(){
        System.out.println("Fullname: " + this.fullName);
        System.out.println("Salary: " + this.getSalary());
    }
}
class EmployeeManager{
    public static void main(String[] args) {
        Employee emp1 = new Employee("AnhNN") {
            @Override
            public double getSalary() {
                return 200;
            }
        };
        emp1.print();
    }
}
