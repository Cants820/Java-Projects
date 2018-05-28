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
    int maxNumberOfPeopleInCar = 6;
    
    //constructor
    public Car(){
        
    }
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }
    
    // Getters and Setters
    
    //Getters the property from the constructor
    //Why is use getters ? It makes the code cleaner. It limits errors. Single point of access of the property.
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    //this is a setter Sets the Value of the Properties
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }
    public int getMinSpeed() {
        return this.minSpeed;
    }
   
    public void setMindSpeed(int newMinSpeed) {
        this.minSpeed = newMinSpeed;
    }
    
    public double getWeight (){
        return this.weight;
    }
    
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    
    
    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }
    
    public boolean setIsTheCarOn(boolean newIsTheCarOn){
        return this.isTheCarOn = newIsTheCarOn;
    }
    
    
    
    public void printVariables() {
        System.out.println("this is the maxSpeed" + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }
    
    public void getOut(){
        //if there's people in the Car
        if(numberOfPeopleInCar > 0){
            numberOfPeopleInCar--;
        } else  {
            System.out.println("No one is in the car " + numberOfPeopleInCar);
        }
    }
   
    public void getIn(){
        if(numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            numberOfPeopleInCar++;   
        } else {
            System.out.println("The Car is Full! " + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
    }
    
    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }
      
    public double howManyMilesTillOutOfGas() {
        return currentFuel + mpg;
    }
    
    public double maxMilesPerFillUp() {
        return maxFuel + mpg;
    }
    
    
    public void turnTheCarOn(){
        if(!getIsTheCarOn()) {
            setIsTheCarOn(true);
        } else {
            System.out.println("The Car is already on " + getIsTheCarOn());
        }
    }
    /**
     * @param args the command line arguments
     */
    
    //main function
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car vitaraCar = new Car();
        vitaraCar.getIn();
        vitaraCar.getIn();
        vitaraCar.getIn();
        vitaraCar.getIn();
        vitaraCar.turnTheCarOn();
        vitaraCar.turnTheCarOn();
        
        
    }
    
}
