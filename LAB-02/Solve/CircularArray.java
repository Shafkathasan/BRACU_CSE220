//Name: Shafkat Hasan
//ID: 19101077
//Lab 01 : Liner Array
package Lab02;

public class CircularArray {

    private int start;
    private int size;
    private Object[] cir;

    /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object[] lin, int st, int sz) {
        start = st;
        size = sz;
        cir = new Object[lin.length];
        for (int i = 0; i < size; i++) {
            cir[(start + i) % lin.length] = lin[i];
        }

    }

    //Prints from index --> 0 to cir.length-1
    public void printFullLinear() {
        for (int i = 0; i <= cir.length - 1; i++) {
            if (i == cir.length - 1) {
                System.out.print(cir[i] + "\n");
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
        System.out.println();
    }

    public void printBackward() {
        for (int i = size - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(cir[(start + i) % cir.length]);
            } else {
                System.out.print(cir[(start + i) % cir.length] + ", ");
            }
        }
        System.out.println();
    }

// With no null cells
    public void linearize() {
        Object[] T = new Object[size];
        for (int i = 0; i < size; i++) {
            T[i] = cir[(start + i) % cir.length];
        }
        cir = T;
    }

    // Do not change the Start index
    public void resizeStartUnchanged(int newcapacity) {
        Object[] T = new Object[newcapacity];
        int k = start;
        for (int i = 0; i < size; i++) {
            T[k] = cir[(start + i) % cir.length];
            k++;
        }
        cir = T;
    }

    // Start index becomes zero
    public void resizeByLinearize(int newcapacity) {
        Object[] T = new Object[newcapacity];
        for (int i = 0; i < size; i++) {
            T[i] = cir[(start + i) % cir.length];
        }
        cir = T;
    }

    /* pos --> position relative to start. Valid range of pos--> 0 to size.
     * Increase array length by 3 if size==cir.length
     * use resizeStartUnchanged() for resizing.
     */
    public void insertByRightShift(Object elem, int pos) {
        if (size >= cir.length) {
            resizeStartUnchanged(size + 3);
        }
        int index = (start + pos) % cir.length;
        for (int i = size; i > pos; i--) {
            cir[(start + i) % cir.length] = cir[(start + i - 1) % cir.length];
        }
        cir[index] = elem;
    }

    public void insertByLeftShift(Object elem, int pos) {

        if (size == cir.length) {
            resizeStartUnchanged(size + 3);
        }
        int index = (start + pos) % cir.length;
        for (int i = 0; i < size - pos; i++) {
            cir[(start + i - 1) % cir.length] = cir[(start + i) % cir.length];
        }
        cir[index] = elem;
        size += pos;
        start--;
    }

    /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos) {
        int index = (start + pos) % cir.length;
        for (int k = 0; k < size - pos; k++) {
            cir[index] = cir[(index + 1) % cir.length];
            index++;
            if (index >= cir.length) {
                index = index % cir.length;
            }
        }
    }

    /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int pos) {
        int index = (start + pos) % cir.length;
        for (int k = 0; k <= size - pos; k++) {
            cir[index] = cir[(index - 1)];
            index--;
        }
        cir[start] = null;
        start++;
        size--;
    }

    //This method will check whether the array is palindrome or not
    public void palindromeCheck() {
        int s = start, l = (start + size - 1) % cir.length;
        int check = 0;
        for (int i = 0; i < size / 2; i++) {
            if (cir[s] == cir[l]) {
                check = 0;
            } else {
                check = 1;
            }
            s++;
            l--;
            if (s > cir.length) {
                s = (start + size) % cir.length;
            }
            if (l < 0) {
                l = cir.length - 1;
            }
        }
        if (check == 0) {
            System.out.println("This array is a palindrome");
        } else {
            System.out.println("This array is NOT a palindrome");
        }
    }

    //This method will sort the values by keeping the start unchanged
    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((int) cir[(j + start) % cir.length] < (int) cir[(i + start) % cir.length]) {
                    Object T = cir[(i + start) % cir.length];
                    cir[(i + start) % cir.length] = cir[(j + start) % cir.length];
                    cir[(j + start) % cir.length] = T;
                }
            }
        }
    }

    //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
    public boolean equivalent(CircularArray k) {
        boolean check = false;
        int s1 = start;
        int s2 = k.start;
        for (int i = 0; i < size; i++) {
            if (cir[s1] == k.cir[s2]) {
                check = true;
            } else {
                check = false;
                break;
            }
            s1 = (s1 + 1) % cir.length;
            s2 = (s2 + 1) % k.cir.length;
        }

        return check;
    }
}
