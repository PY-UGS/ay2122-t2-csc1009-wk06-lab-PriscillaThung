package wk06_lab;
import java.util.HashMap;

public class Week06_qn05 {

    public static void SwapHashMap(HashMap<Integer,Integer> hashmap, int value1, int value2){
        int temp = (int)hashmap.get(value1);
        hashmap.put(value1, hashmap.get(value2));
        hashmap.put(value2, temp);

    }
    public static void main(String args[]){
        HashMap<Integer, Integer> hashmap2 = new HashMap<Integer, Integer>();
        hashmap2.put(0,1);
        hashmap2.put(1,3);
        hashmap2.put(2,5);
        hashmap2.put(3,7);
        hashmap2.put(4,9);
        hashmap2.put(5,11);
        System.out.println("Hash map before swap: " + hashmap2);
        SwapHashMap(hashmap2, 1, 5);
        System.out.println("Hash map after swap: " + hashmap2);
    }
    
}
