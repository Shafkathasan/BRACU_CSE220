//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-03 : Linked List
package Assignment_03;

public class LinkedListTester_01 {

    public static void main(String[] args) {
        //System.out.println("\n/////  Test 01  /////");
        int x = (1077 % 4) + (077 % 6);
        int y = (1077 % 5) + (077 % 9);
        Object A = (x + 1) + "_SAF_" + (y + 10),
                B = (x + 2) + "_SAF_" + (y + 20),
                C = (x + 3) + "_SAF_" + (y + 30),
                D = (x + 4) + "_SAF_" + (y + 40),
                E = (x + 5) + "_SAF_" + (y + 50),
                F = (x + 6) + "_SAF_" + (y + 60);
        Object[] array = {A, B, C, D, E, F};
        LinkedList_01 c = new LinkedList_01(array);
        
        System.out.println("\n/////  Test 02  /////");
        c.printList(); 
        // This should print: 5_SAF_12, 6_SAF_22, 7_SAF_32, 8_SAF_42, 9_SAF_52, 10_SAF_62.
        
        System.out.println("\n/////  Test 03  /////");
        System.out.println(c.countNode()); // This should print Linklist Size: 6
        
        System.out.println("\n/////  Test 04  /////");
        System.out.println(c.get(077%5)); // 077%5 = 3
        
        System.out.println("\n/////  Test 05  /////");
        System.out.println(c.set(077%4, 0)); // This should print: 8_SAF_42
        c.printList(); 
        // This should print: 5_SAF_12, 6_SAF_22, 7_SAF_32, 0, 9_SAF_52, 10_SAF_62.
        
        System.out.println("\n/////  Test 06  /////");
        // returns the reference of the Node at the given index. For invalid idx return null.
        Node myNode = c.searchNode(077%3);
        System.out.println(myNode.element); // This should print: 5_SAF_12 
        // In case of invalid index This will generate nullPointerException.
        
        System.out.println("\n/////  Test 07  /////");
        c.printList();
        c.insert(0, 0);
        c.printList();
        c.insert(8, (array.length-1));
        c.printList();
        c.insert(8, 077%5);
        c.printList();
        
        System.out.println("\n/////  Test 08  /////");
        c.printList();
        c.remove(0);
        c.printList();
        c.remove((array.length-1));
        c.printList();
        c.remove(077%4);
        c.printList();
        
        System.out.println("\n/////  Test 09  /////");
        // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
        Node revH = c.reverseList(); // Head node reference of the reversed list
        LinkedList_01 h5 = new LinkedList_01(revH); // uses the second constructor: LinkedList(Node h)
        h5.printList(); 
        // This should print: 10_SAF_62, 9_SAF_52, 0, 8, 6_SAF_22, 5_SAF_12.  
        
        System.out.println("\n/////  Test 10  /////");
        c.printList();
        // This should print: 5_SAF_12, 6_SAF_22, 8, 0, 9_SAF_52, 10_SAF_62.
        
        // Rotates the list to the right by 1 position.
        c.rotateRight();
        c.printList(); 
        // This should print: 10_SAF_62, 5_SAF_12, 6_SAF_22, 8, 0, 9_SAF_52.
        
        // Rotates the list to the left by 1 position.
        c.rotateLeft();
        c.printList(); 
        // This should print: 5_SAF_12, 6_SAF_22, 8, 0, 9_SAF_52, 10_SAF_62. 
    }
}
