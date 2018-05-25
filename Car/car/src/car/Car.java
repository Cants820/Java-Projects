/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Joseph Kants
 */
public class Car {

    //properties
    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    char condition = 'A';
    boolean isTheCarOn = false;
    String nameOfCar = "Hidalgo";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    int numberOfPeopleInCar = 1;
    
    //constructor
    public Car(int customeMinSpeed){
        
    }
    
    
    //
    public void printVariables() {
        System.out.println("this is the maxSpeed" + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }
    
    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }
      
    /**
     * @param args the command line arguments
     */
    
    //main function
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
