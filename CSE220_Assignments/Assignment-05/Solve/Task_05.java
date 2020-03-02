//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-05 : Special Assignment for Midterm
package Assignment_05;

public class Task_05 {

    public static void main(String[] args) {

        int X = 077 % 37; // 077 % 37 = 26
        int a[] = {X + 1, X + 2, X + 3, X + 4};
        int b[] = {X + 5, X + 6, X + 7, X + 8};
        MyList m = new MyList();
        m.myMethod(a, b);
        m.printList();
    }
}
