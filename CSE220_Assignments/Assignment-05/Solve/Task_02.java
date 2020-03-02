//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-05 : Special Assignment for Midterm
package Assignment_05;

public class Task_02 {

    public static void main(String[] args) {
        int x = 1077 % 35; // 1077 % 35 = 27
        int[] cir = {x+7, x+8, 0, 0, 0, x+1, x+2, x+3, x+4, x+5, x+6};
        printCirArray(cir, 5, 8);
    }

    public static void printCirArray(int[] cir, int st, int sz) {
        for (int i = sz - 1; i >= 0; i--) {
            if (cir[(st + i) % cir.length]%2 == 0) { // Print Only Even
                System.out.print(cir[(st + i) % cir.length] + " ");
            }
        }
        System.out.println();
    }
}
