package ru.gva_dve.battleShips;

import java.util.Scanner;

public class BattleShips {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.setPosition(new int[]{1,2,3});
        ship.shipsHits();
    }

    public static int hits(){
        System.out.print("Введите координаты высстрела -");
        return  sc.nextInt();
    }

}
