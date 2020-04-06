import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(calcExpression(2, 3, 8, 4));
        System.out.println(checkSum(10, 0));
        checkNumber(-1);
        printHello("Glumer");
        System.out.println(checkLeapYear(2019));
        System.out.println(checkTriangle(3, 5, 4));
    }

    public static double calcExpression(double a, double b, double c, double d){
        return a * (b + (c / d));
    }

    public static boolean checkSum(int a, int b){
        int sumValue = a + b;
        return ((sumValue >= 10) && (sumValue <= 20));
    }

    public static void checkNumber(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        }
        else{
            System.out.println("Число отрицательное");
        }
    }

    public static void printHello(String userName){
        System.out.println("Привет, " + userName + "!");
    }

    public static String checkLeapYear(int yearNumber) {
        if ((yearNumber % 4 == 0 && yearNumber % 100 != 0) || (yearNumber % 400 == 0)) {
            return "Да";
        } else {
            return "Нет";
        }
    }

    public static String checkTriangle(int a, int b, int c){
        if ( ((a != b) || (a != c) || (b != c)) && ((a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b))){
            return "Прямоугольный";
        }
        else{
            return "Не прямоугольный";
        }
    }
}
