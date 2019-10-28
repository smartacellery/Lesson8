package Lesson8.Assignments.crapsgame;

import java.awt.Color;
import java.awt.Graphics;

public class Craps {

    private Dice dice1, dice2;
    private int rollnum, point,total;
    private boolean newGame;

    Craps(Graphics g1, Graphics g2, int size1, int size2) {
        //make 2 dice for 2 panels
        dice1 = new Dice(g1, size1);
        dice2 = new Dice(g2, size2);
        //optional set the color 
        dice1.setColor(Color.red, Color.white);
        dice2.setColor(Color.red, Color.white);
        rollnum = 0;
        point = 0;
        newGame = true;
    }

    public void roll() {
        newGame = false;
        rollnum++;
        dice1.roll();
        dice2.roll();
        if (rollnum == 1) {
            point = getTotal();
        }
        dice1.draw();
        dice2.draw();

    }

    public boolean isNewGame() {
        return newGame;
    }

    public int getTotal() {
        total= dice1.getValue() + dice2.getValue();
        return total;
    }

    public int getPoint() {
        return point;
    }
    
  public boolean hasWon(){
      if(rollnum==1) {
          if(total==7|| total==11) {
              return true;
          }
       
      }
     
  
}
}