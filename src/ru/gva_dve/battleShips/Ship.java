package ru.gva_dve.battleShips;


import java.util.ArrayList;



public class Ship {
    private int damageStatus;
    private int size;
    private ArrayList<String> position;

    public Ship( int size)  {
        this.size = size;
        this.damageStatus = 0;
    }

    public Ship() {
        this(3);
    }

    public void setPosition(ArrayList position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "damageStatus=" + damageStatus +
                ", size=" + size +
                ", position=" + position +
                '}';
    }

    public int getDamageStatus() {
        return damageStatus;
    }
    //    public String shipsHits(){
//        int hitting;
//        while (this.damageStatus<this.size){
//            hitting = BattleShips.locationHits();
//            for (String i : position) {
//                if (i == hitting){
//                    System.out.println("попал");
//                    damageStatus++;
//                    break;
//                }else {
//                    System.out.println("не попал");
//                    break;
//                }
//            }
//
//        }
//        return ;
//    }

   public String checkship(String shot){
        String result = "мимо";
        int index = position.indexOf(shot);
        if (index != -1){
            result = "ранил";
            position.remove(index);
            damageStatus++;
        }
        if (position.isEmpty()){
            result = "убил";
        }
        return result;
    }
}