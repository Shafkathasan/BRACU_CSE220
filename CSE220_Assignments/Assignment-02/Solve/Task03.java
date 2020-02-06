//Name: Shafkat Hasan
//ID: 19101077
//Assignment-02 : Circular Array
package Assignment_02;

import java.util.Random;

public class Task03 {

    private int start;
    private int size;
    private Object[] cir;
    Random random = new Random();

    public Task03(Object[] arr, int st, int sz) {
        start = st;
        size = sz;
        cir = arr;
        //No Need to Convert Arry into Cicruler Array in This Task
//        for (int i = 0; i < size; i++) {
//            cir[(start + i) % arr.length] = arr[i];
//        }
    }

    //Prints from index --> 0 to cir.length-1
    public void printFullLinear() {
        for (int i = 0; i <= cir.length - 1; i++) {
            if (i == cir.length - 1) {
                System.out.print(cir[i] + "\n\n");
            } else {
                System.out.print(cir[i] + ", ");
            }
        }
    }

    // Starts Printing from index start. Prints a total of size elements
    public void printForward() {
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.print(cir[(start + i) % cir.length]);
            } else {
                System.out.print(cir[(start + i) % cir.length] + ", ");
            }
        }
        System.out.println("\n");
    }

    public void printBackward() {
        for (int i = size - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(cir[(start + i) % cir.length]);
            } else {
                System.out.print(cir[(start + i) % cir.length] + ", ");
            }
        }
        System.out.println("\n");
    }

    // With no null cells
    public void linearize() {
        Object[] T = new Object[size];
        for (int i = 0; i < size; i++) {
            T[i] = cir[(start + i) % cir.length];
        }
        cir = T;
    }

    // Start index becomes zero
    public void resize(int newcapacity) {
        Object[] T = new Object[newcapacity];
        for (int i = 0; i < size; i++) {
            T[i] = cir[(start + i) % cir.length];
        }
        for (int i = size; i < T.length; i++) {
            T[i] = random.nextInt(100); // Generate random integers in range 0 to 99 
        }
        cir = T;
    }

    public void insert(Object elem, int pos) {

        if (size >= cir.length) {
            resize(size + 3);
        }
        int index = (start + pos) % cir.length;
        for (int i = size; i > pos; i--) {
            cir[(start + i) % cir.length] = cir[(start + i - 1) % cir.length];
        }
        cir[index] = elem;
    }

    public void remove(int pos) {
        int index = (start + pos) % cir.length;
        for (int k = 0; k < size - pos; k++) {
            cir[index] = cir[(index + 1) % cir.length];
            index++;
            if (index >= cir.length) {
                index = index % cir.length;
            }
        }
    }
}
