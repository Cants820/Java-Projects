import java.util.Arrays;




/**
 *
 * @author Joseph
 */
public class ArrayPractice {

    /**
     * @param args the command line arguments
     */
    
    public static void printArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if(i < array.length-1) {
                System.out.print(" ,");
            } else {
             System.out.println("]");    
            }
//            System.out.println("]");   
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Random Objects from Array
        //Array 
        
        //To initialize an array
        int[] intArray1;
        int[] intArray2 = new int[4];
        int[] intArray3 = {1,2,4,5,6};
        
        String[] shoppingList = {"banana", "apples", "pears"};
        
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;
        
        
        //print arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        
        //custom print out arrays        
        printArray(intArray2);
        printArray(intArray3);
        
        //retrieve objects
        System.out.println(intArray2[3]);
        Arrays.sort(intArray3);
        
        
        //Special Loop / For Each Loop
        for(String s: shoppingList) {
            System.out.println("Hi");
        }
    }

}
