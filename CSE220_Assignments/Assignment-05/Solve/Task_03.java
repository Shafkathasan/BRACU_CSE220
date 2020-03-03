//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-05 : Special Assignment for Midterm
package Assignment_05;

public class Task_03 {

    public static void main(String[] args) {
        int X = 1077 % 37; // 1077 % 37 = 4
        LinkedList ll = new LinkedList();
        ll.insert(X + 100);
        ll.printList();

        ll.insert(X + 70);
        ll.printList();

        ll.remove();
        ll.printList();

        ll.insert(X + 58);
        ll.printList();

        ll.insert(X + 79);
        ll.printList();

        ll.remove();
        ll.printList();

        ll.insert(X + 21);
        ll.printList();

        ll.insert(X + 11);
        ll.printList();

    }
}
