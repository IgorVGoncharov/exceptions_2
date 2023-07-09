package FINAL_TASK;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws UserInputException, IOException {
        
        String [] message = inputMessage();
        testMessageLength(message);
        createFile(createPeople(message));
        
    }

    public static String [] inputMessage(){
        String newMessage = null;
        try (Scanner scanner = new Scanner(System.in)){
             System.out.println("Введите в одну строку через пробел следующие данные: \n * Фамилия\n * Имя\n * Отчество\n * Дата рождения (в формате дд.мм.гггг)\n * телефонный номер (состоящий из семи цифр)\n * Пол (Значения 'm' или 'f')");
            System.out.print("Пример: Ivanov Ivan Ivanovich 01.01.2001 1234567 m\nВвод: ");
            newMessage = scanner.nextLine();
        }
        String [] message = newMessage.split(" ");
        return message;
    }

    public static void testMessageLength(String [] message)throws UserInputException{
        if (message.length < 6){
            throw new UserInputException("Введено данных меньше, чем требуется!");
        }
        else if (message.length > 6){
            throw new UserInputException("Введено данных больше, чем требуется!");
        }
    }

    public static String parsBirthday(String [] message)throws UserInputException{
        try {
            LocalDate.parse(message[3], java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy")); 
        } catch (DateTimeParseException e){
            throw new UserInputException("Введен не верный формат даты, необходимо ввести в формате: дд.мм.гггг");
        }
        return message[3];
    }

    public static String parsTelNumber(String [] message)throws UserInputException{
        try {
            Integer.parseInt(message[4]);
        } catch (NumberFormatException e){
            throw new UserInputException("Введено не число.");
        }
        if (message[4].length() != 7){
            throw new UserInputException("Введена не верная длина телефона. Должна быть = 7");
        }
        return message[4];
    }

    public static String parseMale(String [] message) throws UserInputException {
        char male = message[5].charAt(0);
        if (male != 'm' && male != 'f'){
            throw new UserInputException("Введено не верное значение. Должно быть 'm' или 'f'.");
        } else {
            return message[5];
        }
    }

    public static void createFile(People people) throws IOException{
        String fileName = people.getName();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            writer.write(people.toString());
            writer.newLine();
            System.out.println("Файл с именем " + fileName + " создан.");
        }
    }

    public static People createPeople(String [] message) throws UserInputException, IOException{
        String birthday = parsBirthday(message);
        String telNumber = parsTelNumber(message);
        String male = parseMale(message);
        People people = new People(message[0], message[1], message[2], birthday, telNumber, male);
        return people;
    }    
}
