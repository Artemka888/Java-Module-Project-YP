// Class for calculating common bill and devide common bill to people;

public class Calculator {
    int peopleCnt;
    double commonSumm;
    String itemSting = "";

    double getSumm () {
        return this.commonSumm;
    }

    int getPeopleCnt () {
        return this.peopleCnt;
    }

    String getItemSting() {
        return this.itemSting;
    }

    void addItem(String itemName, double price, String ending) {
        this.itemSting += "\n" + itemName + ": " + String.format("%.2f", price) + ending;
        this.commonSumm += price;
    }

    double getSummPerPeople () {
        return this.commonSumm/this.peopleCnt;
    }
    Calculator(int peopleCnt) {
        this.peopleCnt = peopleCnt;
    }
}