import java.awt.Color;  
import java.util.Random;

import tester.*; //tester library
import javalib.funworld.*; //world class
import javalib.worldimages.*; //worldImages class

public class TronWorld extends World{
  Grid grid;
  
  TronWorld(Grid grid) {
    this.grid = grid;
  }

  @Override
  public WorldScene makeScene() {
    return this.grid.drawGrid();
  }
  
  
}

class ExamplesTron {
  Utils u = new Utils();
  int size = 400;
  Grid grid = new Grid(size, 10, u.makeGridArray(size));
  World tron = new TronWorld(grid);
  
  boolean testTronWorld(Tester t) {
    return this.tron.bigBang(500, 500, 1); 
  }
}