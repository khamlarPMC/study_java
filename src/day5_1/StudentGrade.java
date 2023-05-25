/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class StudentGrade {
    public static void main(String[] args) {
        int score;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Inter your score:");
        score = scan.nextInt();
         //create object name grade from class Cut_grade
         
        Cut_Grade grade = new Cut_Grade();
        System.out.println("Your Grade is :"+grade.cutGrade(score));
    }
    
}
