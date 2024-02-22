package week2_diana;

public class DivisibleBy {

    public static void main(String[] args) {

        divisibleBy(100);
    }

    public static void divisibleBy(int num){
        String divisibleBy3 = "";
        String divisibleBy5 = "";
        String divisibleBy15 = "";

        for (int i = 1; i <= num; i++) {

            if(i % 15 == 0 && i % 3 == 0){
                divisibleBy15 += i + " ";
            }
            if(i % 3 == 0 && i % 15 != 0){
                divisibleBy3 += i + " ";
            }
            if(i % 5 == 0 && i % 15 != 0){
                divisibleBy5 += i + " ";
            }

        }
        System.out.println("Divisible by 15: " + divisibleBy15);
        System.out.println("Divisible by 5: " + divisibleBy5);
        System.out.println("Divisible by 3: " + divisibleBy3);

    }
}
