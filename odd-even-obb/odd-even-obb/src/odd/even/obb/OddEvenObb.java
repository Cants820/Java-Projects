/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd.even.obb;

import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class OddEvenObb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            Scanner scanner = new Scanner(System.in); 
       
       int T = scanner.nextInt();
       String s;
       
       for(int i = 0; i < T;i++){
           s=scanner.next();
           
           for(int j = 0; j < s.length(); j++) {
               if(j%2==0) {
                   System.out.print(s.charAt(j));
               }
           }
           System.out.print(" ");
           for (int j = 0; j < s.length(); j++) {
               if(j%2==1){
                     System.out.print(s.charAt(j));
               }
           }
           System.out.println();
       }    
    }
    
    
}
