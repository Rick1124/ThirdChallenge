package challenge;

public class Main {
    public static void main(String[] args) {
        String sol = MathChallenge(5,5);
        System.out.println(sol);
    }

    public static String MathChallenge(int num1, int num2){

        if(num1==num2){
            return "-1";
        }
        else if (num2>num1){
            return "true";
        }
        else {
            return "false";
        }
    }

}
