//Name: Shafkat Hasan
//ID: 19101077
//Assignment-02 : Circular Array
package Assignment_02;

public class Task03_Test {
    public static void main(String[] args) {
        int x = (1077%34) + (1077%33);
        Object arr [] = {x+50,x+4,null,null,x,x+10,x-10,x-18}; //{94, 48, null, null, 44, 54, 34, 26}
        System.out.println("///// Array /////");
        Task03 c = new Task03(arr, 4, 6);
        c.printFullLinear();
        
        System.out.println("///// Forward Print /////");
        c.printForward();
        
        System.out.println("///// Backward Print /////");
        c.printBackward();
        
        System.out.println("///// Linearize /////");
        c.linearize();
        c.printFullLinear();
        
        System.out.println("///// Resize /////");
        c.resize((1077%5)+(1077%3)+8); //(1077%5)+(1077%3)+8 = 10;
        c.printFullLinear();
        
        System.out.println("///// Insert-01 /////");
        c.insert(0, 077%6); // 077%6 = 3;
        c.printFullLinear();
        
        System.out.println("///// Insert-02 /////");
        c.insert(0, 077%5); // 077%5 = 3;
        c.printFullLinear();
        
        System.out.println("///// Remove-01 /////");
        c.remove(077%6);
        c.printFullLinear();
        
        System.out.println("///// Remove-02 /////");
        c.remove(077%5);
        c.printFullLinear();
    }
}
