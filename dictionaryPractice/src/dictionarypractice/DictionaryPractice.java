
package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Joseph
 */
public class DictionaryPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //English to Spanish Dictionary
        
        Map<String,String> engSpanDictionary = new HashMap<String,String>();
        
        engSpanDictionary.put("Monday","Lunes");
        engSpanDictionary.put("Tuesday","Martes");
        engSpanDictionary.put("Wednesday","Miercoles");
        engSpanDictionary.put("Thursday","Hueves");
        engSpanDictionary.put("Friday","Viernes");
        engSpanDictionary.put("Sabado","Saturday");
        engSpanDictionary.put("Sunday","Domingo");
        
        System.out.println(engSpanDictionary.get("Monday"));
        System.out.println(engSpanDictionary.get("Tuesday"));
        System.out.println(engSpanDictionary.get("Wednesday"));
        System.out.println(engSpanDictionary.get("Thursday"));
        System.out.println(engSpanDictionary.get("Friday"));
        System.out.println(engSpanDictionary.get("Sabado"));
        System.out.println(engSpanDictionary.get("Sunday"));
         
        //print all keys and values
        System.out.println(engSpanDictionary.keySet()); 
        System.out.println(engSpanDictionary.values()); 
        
        //print the size 
        System.out.println(engSpanDictionary.size());
        
        //Shopping List
        Map<String, Boolean> shoppingList = new HashMap<String,Boolean>();
        //put values inside dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", Boolean.FALSE);
        //retrieve
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));
        
        
        
        //print key value pairs
        System.out.println(shoppingList.toString());
        
        
        //Remove Key
        shoppingList.remove("Eggs");
        System.out.println(shoppingList.toString());
        
        //Replace Key
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString());
        
        
        //clear dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        //check if dictionary is empty
        System.out.println(shoppingList.isEmpty());
        
        
        
    }
    
}
