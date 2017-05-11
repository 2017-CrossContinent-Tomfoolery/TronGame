import java.awt.Color;   
import java.util.Random;

//import tester.*; //tester library
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
  
  public World onKeyEvent(String ke) {
    return this;
  }
  
  public static void main(String[] arg) {
    Utils u = new Utils();
    int size = 400;
    Player p = new Player(new Posn(1, 1), 10);
    Grid grid = new Grid(size, 20, u.makeGridArray(size, p), p);
    World tron = new TronWorld(grid);
    
    tron.bigBang(500, 500, 1); 
  }
  
}

//class ExamplesTron {
//  Utils u = new Utils();
//  int size = 400;
//  Player p = new Player(new Posn(1, 1), 10);
//  Grid grid = new Grid(size, 20, u.makeGridArray(size, p), p);
//  World tron = new TronWorld(grid);
//  
//  boolean testTronWorld(Tester t) {
//    return this.tron.bigBang(500, 500, 1); 
//  }
//}