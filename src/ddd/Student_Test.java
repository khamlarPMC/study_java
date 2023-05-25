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
public class Student_Test {
    public static void main(String[] args) {
        
        Student  stu =new Student();
        stu.setdata();
        stu.getdata();
        
        Student stu1 = new Student();
        stu1.name= "sear";
        stu1.age= 22;
        
        stu1.getdata();
        
    }
    
}
