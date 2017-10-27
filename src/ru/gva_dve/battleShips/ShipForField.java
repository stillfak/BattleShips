package ru.gva_dve.battleShips;

import java.util.ArrayList;


public class ShipForField {
//    public static ArrayList<String> placeShips(int shipSize) {
//        Ship ship = new Ship();
//        Random rm = new Random();
//        ArrayList<ArrayList<String>> field = new ArrayList<>();
//        int ch = 0;
//        while (ch<ship.getSize()){
//            int xPoision = rm.nextInt(7);
//            int yPoision = rm.nextInt(7);
//            field.add(xPoision, new ArrayList<String>(yPoision));
//            System.out.println(field.get(xPoision));
//    }
//    return null;
//}
//
//    public ArrayList<String> placeShips(int shipSize) {
//        int gridSize = 7;
//        ArrayList<String> alphaCells = new ArrayList<>();
//        String[] alphacoords = new String [shipSize];
//        String temp = null;
//        int [] coords = new int[shipSize];
//        int attempts = 0;
//        boolean success = false;
//        int location = 0;
//
//        shipCount++;
//        int incr = 1;
//        if ((shipCount % 2) == 1) {
//            incr = gridLength;
//        }
//
//        while ( !success & attempts++ < 200 ) {
//            location = (int) (Math.random() * gridSize);
//            //System.out.print(" try " + location);
//            int x = 0;
//            success = true;
//            while (success && x < shipSize) {
//                if (grid[location] == 0) {
//                    coords[x++] = location;
//                    location += incr;
//                    if (location >= gridSize){
//                        success = false;
//                    }
//                    if (x>0 & (location % gridLength == 0)) {
//                        success = false;
//                    }
//                } else {
//                    // System.out.print(" used " + location);
//                    success = false;
//                }
//            }
//        }
//
//        int x = 0;
//        int row = 0;
//        int column = 0;
//        // System.out.println("\n");
//        while (x < shipSize) {
//            grid[coords[x]] = 1;
//            row = (int) (coords[x] / gridLength);
//            column = coords[x] % gridLength;
//            temp = String.valueOf(alphabet.charAt(column));
//
//            alphaCells.add(temp.concat(Integer.toString(row)));
//            x++;
//
//            // System.out.print("  coord "+x+" = " + alphaCells.get(x-1));
//
//        }
//        // System.out.println("\n");
//
//        return alphaCells;
//    }
}
