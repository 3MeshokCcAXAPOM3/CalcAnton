import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в тестовый калькулятор. \n Введите в строку 2 числа и симваол + - * /");
        String input = scanner.nextLine();
        OneNum oneNum = new OneNum();
        oneNum.oneNum(input);
        System.out.println("Спасибо, что правильно воспользовались нашим калькулятором");


    }


}

