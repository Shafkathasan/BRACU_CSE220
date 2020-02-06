//Name: Shafkat Hasan
//ID: 19101077
//Assignment-02 : Circular Array
package Assignment_02;

public class Task03_Test {
    public static void main(String[] args) {
        int x = (1077%34) + (1077%33);
        Object arr [] = {x+50,x+4,null,null,x,x+10,x-10,x-18}; //{94, 48, null, null, 44, 54, 34, 26}
        
        Task03 c = new Task03(arr, 4, 6);
        c.printFullLinear();
        
        c.printForward();
        
        c.printBackward();
        
        c.linearize();
        c.printFullLinear();
    }
}
