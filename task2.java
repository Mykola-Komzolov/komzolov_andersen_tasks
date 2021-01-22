import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Введите имя: ");

        String name1 = console.nextLine();

        String name2 = "Вячеслав";

        if(name1.equals(name2)) {
            System.out.println("Привет, Вячеслав!");
        }
        else {
            System.out.println("Нет такого имени");
        }
    }
}
