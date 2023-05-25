/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author Acer
 */
public class Array_String_Test {
    String[] provice = {"ວຽງຈັນ","ບໍລິຄຳໄຊ"};
    
    
    public void getProvince(){
        for (int i = 0;i < provice.length;i++){
            System.out.println(provice[i]);
        }
    }
    public static void main(String[] args) {
        Array_String_Test pro = new Array_String_Test();
        pro.getProvince();
    }
}
