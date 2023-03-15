import java.util.Scanner;

public class Formatter {
    Scanner scanner = new Scanner(System.in);
    String ruBlOrBlya(double number) {
        if (number == 1) {
            return " рубль";
        }
        int numberInt = (int) number % 100;

        if (11 <= numberInt && numberInt <= 14) {
            return " рублей";
        } else {
            numberInt = (int) number % 10;
            if (numberInt == 1) {
                return " рубль";
            } else if (numberInt == 0 ||(5 <= numberInt)) {
                return " рублей";
            } else{
                return " рубля";
            }
        }
    }

    double readDoublePositive (String errorText) {
        double result;
         do {
             if (scanner.hasNextDouble()) {
                result = scanner.nextDouble();
                if (result >= 0) {
                    return result;
                }
             }
             scanner.next();
             System.out.println(errorText);
        } while (true);
    }

    int readIntPositive (String errorText) {
        int result;
        do {
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                if (result >= 0) {
                    return result;
                }
            }
            scanner.next();
            System.out.println(errorText);
        } while (true);
    }
}
