// dev branch for Y.Practicum

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, это программа \"Калькулятор счтёта\"" +
                "консольное приложение, которое поможет компании разделить счёт на всех!\n");

        Scanner scanner = new Scanner(System.in);
        Formatter formatter = new Formatter();
        Calculator calc;

        calc = new Calculator();
        calc.setPeopleCnt(formatter);

        System.out.println("Введите название товара");

        String newItemName;
        do {
            System.out.println("Хотите добавить ещё один товар? (Если ввод окончен введите \"Завершить\" в любом регистре, чтобы закончить)");
            newItemName = scanner.nextLine();

            if (newItemName.equalsIgnoreCase("Завершить")) {
                break;
            }

            System.out.println("Введите цену товара:");
            double newItemPrice = formatter.readDoublePositive("Неверный формат числа, введите целое или дробное неотрицательное число");
            calc.addItem(newItemName, newItemPrice, formatter.ruBlOrBlya(newItemPrice));
        } while (true);

        if (!calc.getItemSting().isEmpty()) {
            System.out.println("Добавленные товары:" + calc.itemSting);
            System.out.println("Общая стоимость: " + calc.getSumm() + formatter.ruBlOrBlya(calc.getSumm()));
            System.out.println("Сумма на каждого из " + calc.getPeopleCnt() + " : " + String.format("%.2f", calc.getSummPerPeople()) + formatter.ruBlOrBlya(calc.getSummPerPeople()));
        } else {
            System.out.println("Вы не добавили ни одного товара, пожалуйста, запустите программу заново");
        }
    }
}
