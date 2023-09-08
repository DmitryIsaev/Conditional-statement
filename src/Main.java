import java.util.Scanner;

public class Main {

    public static int boilingWater(int water, int teapot) {
        do {
            water += 100;
        } while (water < teapot);
        System.out.println("В чайник налито " + water + " мм воды.");

        int t = 1;
        while (t < 100) {
            t += 1;
        }
        System.out.println("Температура воды в чайнике: " + t + " градусов. Чайник вскипел.");
        return water;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 0;
        int mugOfTea;
        int guests = 0;
        final int teapot = 1000;
        water = boilingWater(water, teapot);

        while (true) {
            System.out.println("Сколько пришло гостей?");
            guests = scanner.nextInt();
            if (guests != 0){
                break;
            }
        }

        for (mugOfTea = 1; mugOfTea <= guests; mugOfTea++) {
            if (water >= 250) {
                water -= 250;
                System.out.println("Гость " + mugOfTea + " получил 250 мм чая.");
                System.out.println("В чайнике осталось " + water + " мм воды.");
            } else {
                water = boilingWater(water, teapot);
                water -= 250;
                System.out.println("Гость " + mugOfTea + " получил 250 мм чая.");
                System.out.println("В чайнике осталось " + water + " мм воды.");
            }
        }
    }
}