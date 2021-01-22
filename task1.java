import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Введите число: ");

        int number = console.nextInt();

        if(number > 7) {
            System.out.println("Привет!");
        }
        else {
            System.out.println("Ошибка!");
        }
    }
}
