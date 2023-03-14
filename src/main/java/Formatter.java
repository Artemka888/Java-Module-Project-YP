import java.util.Scanner;

public class Formatter {
    Scanner scanner = new Scanner(System.in);
    String ruBlOrBlya(double number) {
        int result = (int) ((number - Math.floor(number)) * 100);
        return (result % 10) == 0 ? " рубля" : " рубль";
    }

    double readDouble (String conditions) {
        while (!scanner.hasNextDouble()) {
            System.out.println(conditions);
            scanner.next();
        }
        return scanner.nextDouble();
    }

    int readInt (String conditions) {
        while (!scanner.hasNextInt()) {
            System.out.println(conditions);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
