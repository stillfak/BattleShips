package ru.gva_dve.battleShips;

import java.util.*;

/**
 * Содержит тестовый класс, содержит метод для ввода координат.
 *
 * @author Gavrikov V. && Dubinin V. 15IT18.
 */

public class BattleShips {

    static Random rm = new Random();

    public static void main(String[] args) {

        ArrayList<String> position = new ArrayList<>();

        int travelCounter = 0;
        int onePointPosition = rm.nextInt(7);

        position.add(String.valueOf(onePointPosition));
        position.add(String.valueOf(onePointPosition + 1));
        position.add(String.valueOf(onePointPosition + 2));

        Ship ship = new Ship();
        ship.setPosition(position);

        while (!ship.getPosition().isEmpty()) {

            System.out.println(ship.checkship(Input.locationHits()));
            travelCounter++;

        }

        System.out.println("Вы выиграли!!!");
        System.out.println("Кол-во ходов за игру - " + travelCounter);
    }




}
