package week1_diana;

public class FinRa {

    public static void main(String[] args) {

        finra(30);
    }

    public static void finra(int num){

        for(int i = 0; i <= num; i++){

            String result = "";

            if(i % 3 == 0){
                result += "Fin";
            }
            if(i % 5 == 0){
                result += "Ra";
            }
            System.out.println(result.isEmpty()? i : result);
        }

    }
}
