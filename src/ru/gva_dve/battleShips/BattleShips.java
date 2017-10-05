package ru.gva_dve.battleShips;

import java.util.ArrayList;
import java.util.Scanner;

public class BattleShips {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> position = new ArrayList<>(7);
        int travelCounter = 0;
        position.add("1");
        position.add("2");
        position.add("3");
        Ship ship = new Ship();
        ship.setPosition(position);
        while (ship.getDamageStatus()<3) {
            System.out.println(ship.checkship(locationHits()));
            travelCounter++;
        }
        System.out.println("Кол-во ходов за игру - " + travelCounter);
        //startgame(ship);
    }

    public static String locationHits(){
        System.out.print("Введите координаты высстрела -");
        return  sc.next();
   }

//    public static void startgame(Ship ship) {
//        System.out.println(ship.shipsHits());
//    }


}
