package wk06_lab;
import java.util.*;

public class Week06_qn04 {
    public static void insert(HashMap<Integer, Integer> hashmap, int value){
        for(int i = 1; i < hashmap.size(); i++){
            int previous = (int)hashmap.get(i-1);
            if(value > (int)hashmap.get(hashmap.size()-1)){
                hashmap.put(hashmap.size(), value);
                return;
            }
            if((int)hashmap.get(i) > value && value > previous){
                hashmap.put(hashmap.size(),0);
                for(int j = hashmap.size()-1; j>=i ;j--){
                    hashmap.put(j, hashmap.get(j-1));
                }
                hashmap.put(i ,value);
                return;
            
            }
            if(value < (int)hashmap.get(0)){
                for(int j = hashmap.size(); j>=0 ;j--){
                    hashmap.put(j, hashmap.get(j-1));
                }
                hashmap.put(0 ,value);
                return;
            }
            

        }
    }
    public static void main(String args[]){
        HashMap<Integer, Integer> myHashMap = new HashMap<Integer, Integer>();

        myHashMap.put(0,1);
        myHashMap.put(1,3);
        myHashMap.put(2,5);
        myHashMap.put(3,7);
        myHashMap.put(4,9);
        myHashMap.put(5,11);
        System.out.println("Hash map before insert: " + myHashMap);
        insert(myHashMap, 6);
        System.out.println("Hash map after insert: " + myHashMap);

        
    }
    
}
