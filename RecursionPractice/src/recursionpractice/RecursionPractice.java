/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionpractice;

/**
 *
 * @author Joseph
 */
public class RecursionPractice {

    /**
     * @param args the command line arguments
     */
    
    public static int Summation(int n) {
     //Base Case
        if(n <= 0) {
            return 0; //additive identity property
     //Recursive Case
        } else {
            return n + Summation(n-1);
        }
    }
    
    //5! = 5*4*3*2*1
    public static int Factorial(int n) {
        if(n <= 0) {
            return 1;
        } else {
            return n * Factorial(n-1);
        }
    }
    
    public static int Exponential(int n, int p) {
        //Base case
        if(p <= 0) { //multiplicative identity
            return 1;
        } else {
        //Recursive case
            return n * Exponential(n,p-1); 
        } 
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println(Summation(3));
       System.out.println(Factorial(5));
       System.out.println(Exponential(5,4));
    }
    
}
