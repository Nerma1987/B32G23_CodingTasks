package week1_diana;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        divide(13, 6);
    }

    public static void divide(int num1, int num2){
        int count = 0;
        //String result = div1 + " / " + div2;

        for(int i = 0; i < num1; i++){
            num1 -= num2;
            count++;
        }

        System.out.println(count + " with remainder " + num1);
    }

}
