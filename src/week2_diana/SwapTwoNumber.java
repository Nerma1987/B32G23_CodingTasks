package week2_diana;

public class SwapTwoNumber {

    public static void main(String[] args) {

        swapTwoNumb(10, 15);
    }

    public static void swapTwoNumb(int x, int y){//x = 10, y = 15
        x = x + y;//10 + 15; x = 25
        y = x - y;//25 - 15; y = 10
        x = x - y;//25 - 10; x = 15

        System.out.println("x = "+ x);//15
        System.out.println("y = "+ y);//10
    }
}
