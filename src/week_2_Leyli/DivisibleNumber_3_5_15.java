package week_2_Leyli;

public class DivisibleNumber_3_5_15 {
    public static void main(String[] args) {

        int num = 100;
        String by3 = "";
        String by5 = "";
        String by15 = "";

        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                by15 += i + " ";
            } else if (i % 5 == 0) {
                by5 += i + " ";
            } else if (i % 3 == 0) {
                by3 += i + " ";
            }
        }
        System.out.println("Divisible by 15: " + by15);
        System.out.println("Divisible by 5: " + by5);
        System.out.println("Divisible by 3: " + by3);


        System.out.println("------------------------------------------------");

    }
}


//        public class divisible3_5_15 {
//           // public static void main(String[] args) {
//                int number ;
//                number = 100;
//
//                ArrayList<Integer> by3 = new ArrayList<>();
//                ArrayList <Integer> by5 = new ArrayList<>();
//                ArrayList <Integer> by15 = new ArrayList<>();
//
//
//
//                for (int i = 1; number >= i; i++) {
//
//                    if(i % 15 == 0 ){
//                        by15.add(i);
//                    }
//                    else if (i%5 == 0) {
//                        by5.add(i);
//                    }
//                    else if (i%3 == 0) {
//                        by3.add(i);
//                    }



//                System.out.println(by15);
//                System.out.println(by3);
//                System.out.println(by5);
//            }
//        }






/*
Create a program that will print all the numbers divisible by 3, 5, and 15 in
 range from 1 to the given N number.(Divisible by 3, 5, 15 Task).
 */
