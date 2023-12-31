import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static int boilingWater(int water, int teapot) {
        do {
            water += 50;
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
        int water = 0;
        int mugOfTea;
        int guests;
        final int teapot = 1000;

        water = boilingWater(water, teapot);

        String[] guest = {"Надя", "Аля", "Света", "Оля", "Катя", "Лена", "Наташа", "Света", "Оксана"};
        for (String allGuests : guest) {
            System.out.print(allGuests + " ");
        }

        while (true) {
            try {
                System.out.println("\nСколько пришло гостей?");
                Scanner scanner = new Scanner(System.in);
                guests = scanner.nextInt();
                if (guests != 0) {
                    break;
                }
            } catch (NoSuchElementException error) {
                System.out.println("Ошибка: введены буквы вместо чисел");
            }
        }

        for (mugOfTea = 1; mugOfTea <= guests; mugOfTea++) {
            try {
                if (water < 250) {
                    System.out.println("В чайнике не осталось воды. Надо ещё разогреть.");
                    water = boilingWater(water, teapot);
                }
                water -= 250;
                System.out.println(guest[mugOfTea - 1] + " получила 250 мм кофе или чая.");
                System.out.println("В чайнике осталось " + water + " мм воды.");
            } catch (IndexOutOfBoundsException error) {
                System.out.println("Остальные гости без чая");
            }
        }
    }
}