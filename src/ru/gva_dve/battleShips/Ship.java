package ru.gva_dve.battleShips;



public class Ship {
    private int damageStatus;
    private int size;
    private int[] position;

    public Ship( int size)  {
        this.size = size;
        this.damageStatus = 0;
    }


    public void setPosition(int[] position) {
        this.position = position;
    }

    public String shipsHits(){
        int hitting;
        while (this.damageStatus<this.size){
            hitting = BattleShips.hits();
            for (int i : position) {
                if (i == hitting){
                    damageStatus++;
                }
            }

        }
    }

}
