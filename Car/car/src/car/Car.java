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
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
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
      
    public void getIn() {
        // numberOfPeopleInCar = numberOfPeopleInCar + 1;
            numberOfPeopleInCar++;
            
            if(numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            }

        } 
    }
    
    public void getOut() {
       //numberOfPeopleInCar = numberOfPeopleInCar - 1;

       if(numberOfPeopleInCar > 0) {
       numberOfPeopleInCar--;
       } else {
           
       }
       
    }
    
    public double howManyMilesTillOutOfGas() {
        return currentFuel + mpg;  
    }
    
    public double maxMilesPerFillUp() {
        return maxFuel + mpg;
    }
    
    public void turnTheCarOn() {
        // can be written if(!isTheCarOn)
        if(isTheCarOn == false) { //equality comparison
            isTheCarOn = true; //assignment statement
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    
    
    
    //main function
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car birthdayPresent = new Car(500,5000.545, true);
        System.out.println("Birthday Car v1");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles Left" + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles" + birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday Car v2");
        birthdayPresent.printVariables();
        birthdayPresent.getOut();
        System.out.println("Birthday Car v3");
        birthdayPresent.printVariables();
        
        
        
    }
    
}
