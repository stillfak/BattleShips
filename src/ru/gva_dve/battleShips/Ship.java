package ru.gva_dve.battleShips;


import java.util.ArrayList;



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