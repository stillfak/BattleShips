package ru.gva_dve.battleShips;


import java.util.ArrayList;

/**
 * Данный класс содержит объект ship(корабль), и метод для проверки выстрела по кораблю.
 *
 * @author Gavrikov V && Dubinin V 15it18.
 */

public class Ship {
    private ArrayList<String> position;

    public ArrayList<String> getPosition() {
        return position;
    }

    public void setPosition(ArrayList position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Ship{" +
                " position=" + position +
                '}';
    }

    /**
     * Данный метод обрабатывает данные введеные пользователем и на основе обрабработанных данных возвращает
     * результат "ранил" если введеная координата совпадает с одной из 3 ячеек координат корабля, "убил" если пользовател
     * уничтожил последнюю часть корабля(3) в противном случае выводит "мимо".
     *
     * @param shot координата выстрела
     * @return "мимо" если пользователь промахнулся "ранил" если пользователь попал в корабль "убил" если пользовател уничтожил полностью корабль.
     */

   public String checkship(String shot){
        String result = "мимо";
        int index = position.indexOf(shot);
        if (index != -1){
            result = "ранил";
            position.remove(index);
        }
        if (position.isEmpty()){
            result = "убил";
        }
        return result;
    }



}