import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите скобочную последовательность: ");
        String x = console.nextLine();
        int K = 0;
        int C = 0;
        boolean G = true;
        char[] charArray = x.toCharArray();  // создаём массив типа char из переменной result(тип string)
        for(int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '[') {
                K += 1;
            }
            else if (charArray[i] == ']') {
                K -= 1;
            }
            else if (charArray[i] == '(') {
                C += 1;
            }
            else if (charArray[i] == ')'){
                C -= 1;
            }
            if (K < 0) {
                K += 1;
                G = false;
                System.out.println("Нет открывающейся скобки для ]");
            }
            else if (C < 0) {
                C += 1;
                G = false;
                System.out.println("Нет открывающейся скобки для )");
            }
        }
        if (K > 0) {
            G = false;
            System.out.println("Не закрытая скобка [");
        }
        else if (C > 0) {
            G = false;
            System.out.println("Не закрытая скобка (");
        }
        if (G == true) {
            System.out.println("Всё верно.");
        }
    }
}
