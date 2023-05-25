/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_1;

/**
 *
 * @author Acer
 */
public class Bus extends Car{
    
    int seat =12;
    
    @Override
    public void drive(){
        System.out.println("ສອງລໍ້"); 
    }
    //erro
    
     // public void gaer(){
     //   System.out.println("ລະບົບົເກຍກະປຸກ");
        
    //}
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        System.out.println("color:"+bus1.color);
        System.out.println("ຍີ່ຫໍ້:"+bus1.color);
        System.out.println("ຈຳນວນທີ່ນັ່ງ:"+bus1.seat);
        bus1.drive();
        bus1.gear();
    }
    
}
