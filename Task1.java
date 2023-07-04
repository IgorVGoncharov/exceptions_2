//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        input_val();
        
    }
    public static void input_val(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        try {
            Double val = Double.parseDouble(scanner.nextLine());
            System.out.println("Введено следующее значение: " + val);
        } catch (NumberFormatException e) {
            System.err.println("Ошибка! Введено не дробное число. Повторите ввод.");
            input_val();
        }
    }
}
