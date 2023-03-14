// dev branch for Y.Practicum

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Formatter formatter = new Formatter();
        int peopleCnt;
        Calculator calc;
        String newItemName;

        System.out.println("Привет, это программа \"Калькулятор счтёта\"" +
                "консольное приложение, которое поможет компании разделить счёт на всех!\n");

        do {
            System.out.println("На сколько людей нужно разделить счёт? Введите целое число больше 1");
            peopleCnt = formatter.readInt("Неверный формат числа, введите целое число");
        } while (peopleCnt <= 1);

        calc = new Calculator(peopleCnt);

        System.out.println("Введите название товара");

        do {
            System.out.println("Хотите добавить ещё один товар? (Если ввод окончен,  или \"Завершить\" в любом регистре, чтобы закончить)");
            newItemName = scanner.next();

            if (newItemName.equalsIgnoreCase("Завершить")) {
                break;
            }

            System.out.println("Введите цену товара:");
            double newItemPrice = formatter.readDouble("Неверный формат числа, введите целое или дробное число");
            calc.addItem(newItemName, newItemPrice, formatter.ruBlOrBlya(newItemPrice));
        } while (true);

        if (!calc.getItemSting().isEmpty()) {
            System.out.println("Добавленные товары:" + calc.itemSting);
            System.out.println("Общая стоимость:" + calc.getSumm() + formatter.ruBlOrBlya(calc.getSumm()));
            System.out.println("Сумма на каждого из " + calc.getPeopleCnt() + " : " + calc.getSummPerPeople() + formatter.ruBlOrBlya(calc.getSummPerPeople()));
        } else {
            System.out.println("Вы не добавили ни одного товара, пожалуйста, запустите программу заново");
        }
    }
}
