import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(isLeapYear());

    }

    public static String  isLeapYear () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в формате 'yyyy'");
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            return "366 дней";
        } else if (year % 100 == 0) {
            return "365 дней";
        } if (year % 4 == 0) {
            return "366 дней";
        } else if (year != 4) {
            return "365 дней";
        } else{
            return "ничего";
        }

    }

}


