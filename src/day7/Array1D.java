/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Array1D {
    public static void main(String[] args) {
        final int max = 3;
        int[] num = new int[max];
        Scanner scan =new Scanner(System.in);
        
        for(int i = 0 ; i< num.length;i++){
            System.out.print("ປ້ອມຈຳນວນທີ່ "+(i+1) +":");
            num[i] = scan.nextInt();
        }
        for(int  i = 0; i<num.length;i++){
            System.out.println("num["+i + "] = " + num[i]);
        }
        Arrays.sort(num);
         for(int  i = 0; i<num.length;i++){
            System.out.println(num[i]);
        }
        
    }
}
