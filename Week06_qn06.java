package wk06_lab;
import java.util.HashMap;
import java.util.Random;


public class Week06_qn06 {

    public static final int maxCount = 500;

    public static int SearchValue(HashMap<Integer, Integer>hashmap, int SearchValue){
        for (int j = 0; j < maxCount; j++){
            if((int)hashmap.get(j) == SearchValue){
                return j;
            }
        }

        return -1;


    }
    public static void main(String args[]){
        
        
        HashMap<Integer, Integer> HashMapQn3 = new HashMap<Integer, Integer>();
        Random rand = new Random();
        int searchValue = rand.nextInt(1000,9999);
        System.out.println("Value to search is : "+ searchValue);

        for (int i = 0; i < maxCount; i++){
            HashMapQn3.put(i, rand.nextInt(1000,9999));
        }
        System.out.println(HashMapQn3);
        System.out.println("Index (key) of value is at: " + SearchValue(HashMapQn3, searchValue));
        
       
    


    }
    
}
