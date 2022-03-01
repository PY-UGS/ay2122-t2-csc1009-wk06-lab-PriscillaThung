import java.util.*;

public class Week6 {

    private static final int count = 5;
    private static final int multiplier = 9; //9000;
    private static final int adder = 1;
    

    public static void main (String[] args)
    {
        LinkedList linkedList = new LinkedList();

        linkedList.AddNode(1);
        linkedList.AddNode(3);
        linkedList.AddNode(5);
        linkedList.AddNode(7);
        linkedList.AddNode(11);

        linkedList.PrintList();
        linkedList.AddAndSort(9);
        linkedList.PrintList();

        linkedList.Swap(1, 5);
        linkedList.PrintList();

        LinkedList newList = new LinkedList();
        int randomInt;
        for(int i = 0; i < count;i ++)
        {
            randomInt = (int) (Math.random()* multiplier + adder);
            newList.AddNode(randomInt);
        }
        newList.PrintList();
        
        int testInt = (int) (Math.random()* multiplier + adder);
        System.out.println("Value to test: " + testInt);
        System.out.println("Index at: " + newList.CheckForData(testInt));


    }

}
