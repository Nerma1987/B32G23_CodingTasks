package week_5_karim;

public class ReverseString {


    public static void main(String[] args) {



        String str="abcdef";
        System.out.println("reverse(str) = " + reverse(str));
    }
    public static String reverse(String str){

        StringBuilder ab=new StringBuilder();
        ab.append(str);
        return ""+ab.reverse();

    }
}
