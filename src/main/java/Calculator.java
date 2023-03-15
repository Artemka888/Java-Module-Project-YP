// Class for calculating common bill and devide common bill to people;

public class Calculator {
    int peopleCnt;
    double commonSumm;
    StringBuilder itemSting;

    Calculator() {
        this.peopleCnt = 0;
        this.itemSting = new StringBuilder();
    }

    double getSumm () {
        return this.commonSumm;
    }

    void setPeopleCnt (Formatter formatter) {
        int peopleCnt;
        do {
            System.out.println("На сколько людей нужно разделить счёт? Введите целое число больше 1");
            peopleCnt = formatter.readIntPositive("Неверный формат числа, введите целое число больше 1");
        } while (peopleCnt <= 1);
        this.peopleCnt = peopleCnt;
    }

    int getPeopleCnt () {
        return this.peopleCnt;
    }

    String getItemSting() {
        return this.itemSting.toString();
    }

    void addItem(String itemName, double price, String ending) {
        this.itemSting.append("\n").append(itemName).append(": ").append(String.format("%.2f", price)).append(ending);
        this.commonSumm += price;
    }

    double getSummPerPeople () {
        return this.commonSumm/this.peopleCnt;
    }
}