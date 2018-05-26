/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointoss;

/**
 *
 * @author Joseph
 */
import java.util.Random;

public class CoinToss {

//    public int tossACoin() { //returns integer
//     Random rand = new Random();
//     int toss = Math.abs(rand.nextInt()) % 2;
//     return toss;
//    }
      public String tossACoin() { //returns String
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        if(toss==0) {
            return "HEADS";
        } else {
            return "TAILS";
        } 
        
      }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        
    }
    
}
