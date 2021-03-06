import java.util.ArrayList; 
import java.util.Arrays;
import java.awt.Color; 
import java.util.Random;

import tester.*; //tester library
import javalib.funworld.*; //world class
import javalib.worldimages.*; //worldImages class

public class Grid {
  int size;
  int cellSize;
  ArrayList<ArrayList<Integer>> gridArray;
  
  Grid(int size, int cellSize, ArrayList<ArrayList<Integer>> gridArray) {
    this.size = size;
    this.cellSize = cellSize;
    this.gridArray = gridArray;
  }
  
  
     
  WorldScene drawGrid() {
    WorldScene result = new WorldScene(size, size); //empty worldscene to draw cells on.
     
    for(int j = 0; this.gridArray.size() > j; j++) {
      
      for(int i = 0; this.gridArray.get(j).size() > i; i++) {
          WorldImage cell = new RectangleImage(cellSize, cellSize, OutlineMode.OUTLINE, Color.BLACK);
          result = result.placeImageXY(cell, (cellSize*i) + (cellSize/2), (cellSize*j) + (cellSize/2));
        }
      }
     
    return result;
  }  
  
}

class Utils {
  ArrayList<ArrayList<Integer>> makeGridArray(int size) {
//    System.out.println("1");
    
    
    ArrayList<ArrayList<Integer>> gridArray = new ArrayList<ArrayList<Integer>>(size); //2DArray with random ints ranging from 0 to 2 
    //populating the gridArray with the array aList of random ints ranging from 0 to 2;
    for(int i = size; 0 < i; i--) {
      ArrayList<Integer> gridRow = new ArrayList<Integer>(size);
      for(int j = size; 0 < j; j--) {
        int randomNum = (int)Math.round(Math.random() * 2);
        gridRow.add(randomNum);
      }
//      System.out.println("" + gridRow);
      gridArray.add(gridRow);
    }
    
//    System.out.println("" + gridArray);
    
    return gridArray;
  }
}
