package week1_diana;

public class EvenOrOdd {

    public static void main(String[] args) {

        evenOrOdd(8);
    }

    public static void evenOrOdd(int num){

        if(num % 2 == 0){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }
    }

}
