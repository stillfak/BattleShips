package ru.gva_dve.battleShips;

import java.util.*;

/**
 * Вспомогательный класс для ввода и проверки данных пользователя.
 *
 * @author Gavrikov V && Dubinin V 15it18.
 */
public class Input {

    static Scanner sc = new Scanner(System.in);


    /**
     * Данный метод для ввода координат выстрела.
     *
     * @return координату выстрела строчного типа.
     */
    public static String locationHits() {
        System.out.println("Введите координаты выстрела");
        System.out.println("от 0 до 9 ");
        return checkhits(sc.nextInt());
    }

    /**
     * Данный метод проверяет введеныые данные пользователем
     *
     * @return
     */
    private static String checkhits(int hits) {
        if (hits > 9 || hits < 0) {
            System.out.println("координаты данного ячейки поля не существует");
            locationHits();
        }
        return String.valueOf(hits);

    }
}
