import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String expression = scanner.nextLine();
        System.out.println(calc(expression));
        scanner.close();}

    public static String calc (String input){
        String[] output = input.split(" ");
        String[] numbers10={"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] numbers={"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        int numberOne=0, numberTwo=0;
        if(Arrays.asList(numbers10).contains(output[0]) && Arrays.asList(numbers10).contains(output[2])){
            for(int i=0; i<numbers10.length; i++){
                if(output[0].equals(numbers10[i])){
                    numberOne=i+1;
                }
                if(output[2].equals(numbers10[i])){
                    numberTwo=i+1;
                }
            }} else if(Arrays.asList(numbers10).contains(output[0]) | Arrays.asList(numbers10).contains(output[2])){
            return "Exception";
        }else {
            numberOne = Integer.parseInt(output[0]);
            numberTwo = Integer.parseInt(output[2]);
        }
        int result=0;
        if (output.length == 3) {
            if (numberOne>0 && numberOne<=10 && numberTwo>0 && numberTwo<=10) {
                switch(output[1]){
                    case "+":
                        result = numberOne + numberTwo;
                        break;
                    case "-":
                        result = numberOne - numberTwo;
                        break;
                    case "*":
                        result = numberOne * numberTwo;
                        break;
                    case "/":
                        result = numberOne / numberTwo;
                        break;
                }
            } else {
                return "Exception";}
        }
        if (output.length != 3){
            return "Exception";
        }
        String[] symbols = {"+", "-", "/", "*"};
        int schetchik=0;
        for (String symbol : symbols) {
            if (output[1].equals(symbol)) {
                schetchik = schetchik + 1;
            }
        }
        if(schetchik==0){  return "Exception";}
        String answer="";
        if(Arrays.asList(numbers10).contains(output[0]) && Arrays.asList(numbers10).contains(output[2])) {
            if (result > 0) {
                answer = numbers[result - 1];
            } else {
                return "Exception";
            }
        }else{
            answer = "" + result;
        }
        return answer;
    }
}