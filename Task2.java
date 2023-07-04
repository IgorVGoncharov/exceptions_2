import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите значение на которое будем делить: ");
            int d = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите индекс элемента: ");
            int i = Integer.parseInt(scanner.nextLine());
            double catchedRes1 = intArray[i] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка. Введено не число.");
        } catch (ArithmeticException e){
            System.out.println("Ошибка. На ноль делить нельзя.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка. Такого индекса нет.");
        }

    }

}
