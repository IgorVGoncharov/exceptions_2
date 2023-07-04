//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String inputed_text = scanner.nextLine();
        if (inputed_text.length() == 0){
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
        System.out.print("Введенн следующий текст: " + inputed_text);
    }
}
