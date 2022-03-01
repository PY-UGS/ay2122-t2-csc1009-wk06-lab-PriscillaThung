public class LinkedList {

    public LinkedList()
    {
    }
    Node head;
    
    public class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d; next = null;
        }
    }

    public void AddNode(int newInt)
    {
        Node newNode = new Node(newInt);
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = null;

        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }

        last.next = newNode;

    }


    public void PrintList()
    {
        Node n = head;
        System.out.print("Linked list: ");
        while(n != null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }


    public void AddAndSort(int value)
    {
        Node newNode = new Node(value);
        Node n = head;
        while(n.next != null)
        {
            if(value < n.next.data)
            {
                Node nextNode = n.next;
                n.next = newNode;
                newNode.next = nextNode;
                return;
            }
            n = n.next;
        }
        n.next = newNode;
    }

    public void Swap(int a, int b)
    {
        Node nodeA = GetData(a);
        Node nodeB = GetData(b);
        int temp = nodeA.data;
        nodeA.data = nodeB.data;
        nodeB.data = temp;
    }

    public Node GetData(int index)
    {
        int count = 0;
        Node nodeAtindex = head;
        Node n = head;
        while(n != null)
        {
            if(count == index)
            {   
                nodeAtindex = n;
                return nodeAtindex;
   
            }
            n = n.next;    
            count++;
        }

        return head;
    }

    public int CheckForData(int data)
    {
        int count = 0;
        Node n = head;
        while(n != null)
        {
            if(n.data == data)
            {   
                return count;
            }
            n = n.next;    
            count++;
        }

        return -1;
    }

}
