/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddd;

/**
 *
 * @author Acer
 */
public class Student {
    String name;
    int age;
    
    
    public void setdata(){
        name ="java";
        age = 20;
    }
    public void getdata(){
        System.out.println("ຊື່:"+name);
        System.out.println("ອາຍຸ:"+age);
    }
    
    
}
