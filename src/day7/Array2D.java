
package day7;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
   
        int[][] num = new int[3][4];
        Scanner scan = new Scanner(System.in);
//        int b= 1;
        for(int i =0; i<3 ;i++ ){
            for(int  j = 0 ;j<4 ;j++){
              System.out.print("num[" + i+"]["+j +"]");
                num[i][j] =scan.nextInt();
//                b+=2;
            }
        }
        for(int i =0; i<3 ;i++ ){
            int row=0;
            for(int  j = 0 ;j<4 ;j++){
                
                System.out.print(num[i][j] + "\t");
                row= row+num[i][j];
            }
            System.out.print(row);
            System.out.println("");   
        }        
        for(int i=0; i<4; i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                sum += num[j][i];
            }
        System.out.print(sum+"\t");
        }    
    }
}
