/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Joseph
 */
public class Person {

      private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        age = initialAge;
        
        if(getAge() < 0) {
            setAge(getAge());
            System.out.println("Age is not valid, setting age to 0.");
        }
        
	}

    //getter and setter 
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int newAge) {
        this.age = newAge;
    }

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        if(getAge() < 13) {
            System.out.println("You are young.");
        } else if(getAge() >= 13 && getAge() < 18) {
            System.out.println("You are a teenager.");    
        } else {
            System.out.println("You are old.");
        }
        
        
	}

	public void yearPasses() {
  		// Increment this person's age.
        setAge(getAge() + 1);
	}
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Person joseph = new Person(15);
        joseph.yearPasses();
        joseph.yearPasses();
        joseph.amIOld();
        
    }
    
}
