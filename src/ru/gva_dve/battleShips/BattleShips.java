package ru.gva_dve.battleShips;

import java.util.*;


public class BattleShips {

    static Scanner sc = new Scanner(System.in);
    static Random rm = new Random();

    public static void main(String[] args) {
        ArrayList<String> position = new ArrayList<>();
        int travelCounter = 0;
        int onePointPosition = rm.nextInt(4);
        position.add(String.valueOf(onePointPosition));
        position.add(String.valueOf(onePointPosition + 1));
        position.add(String.valueOf(onePointPosition + 2));
        Ship ship = new Ship();
        ship.setPosition(position);
        while (!ship.getPosition().isEmpty()) {
            System.out.println(ship.checkship(locationHits()));
            travelCounter++;
        }
        System.out.println("Кол-во ходов за игру - " + travelCounter);
   }

    public static String locationHits(){
        System.out.print("Введите координаты высстрела -");
        return  sc.next();
   }
    


}
