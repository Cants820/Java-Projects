package guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class GuessTheNumber {

    //properties
    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);

    //contructor
    public GuessTheNumber() {
        Random rand = new Random();
        max = 10;  
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
        
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big");
            } else if (move < theNumber) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("You GOT IT BRO!!");
                break; //ends the loops
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    //class method No Instance needed to use this function
    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is out of range");
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Welcome to Guess The Number");
        guessGame.play();
    }

}
