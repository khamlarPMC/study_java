/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_1;

/**
 *
 * @author Acer
 */
public class Cut_Grade {
    public char cutGrade(int score){
        char grade;
        if(score >=80) grade ='A';
        else if (score>=70) grade ='B';
        else if(score>=60) grade = 'C';
        else if(score >=50) grade ='D';
        else grade ='F'; 
        return grade;
    }
}
