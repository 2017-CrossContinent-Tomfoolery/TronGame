import java.util.ArrayList;   
import java.util.Arrays;
import java.awt.Color; 
import java.util.Random;

//import tester.*; //tester library
import javalib.funworld.*; //world class
import javalib.worldimages.*; //worldImages class

//represents a Player in the game
public class Player {
  Posn position;
  int playerSize;
  
  Player(Posn postion, int playerSize) {
    this.position = position;
    this.playerSize = playerSize;
  }
  
  WorldImage drawPlayer() {
    return new CircleImage(playerSize, OutlineMode.SOLID, Color.orange);
  }
  
  int getPositionX() {
    return this.position.x;
  }
  
  int getPostionY() {
    return this.position.y;
  }
}
