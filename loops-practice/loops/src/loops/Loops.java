/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author Joseph
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    //while loop
    //instance method
    public static void whileLoop() {

        int x = 0;
        while (x < 5) {

            System.out.println("The value of x is " + x);
            x++;
        }
    }

    //Do - While Loop
    public static void doWhile() {
        int x = 0;
        do {
            System.out.println("The value of x is " + x);
            x++;
        } while (x < 10);
    }

    //nested for loop. Run the finish an iteration of the nested loop then goes to the next loop
    public static void nestedLoop() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y <  10;
            y++){
            System.out.println("(" + x + ","+  y + ")");
            }
            
        };
    }

    //For Loop 
    public static void forLoop() {
        for (int x = 0; x < 20; x++) {
            System.out.println("The value of x is " + x);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
//        doWhile();
//          whileLoop();
//    forLoop();
nestedLoop();
    }

}
