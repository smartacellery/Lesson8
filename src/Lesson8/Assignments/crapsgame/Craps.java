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
        point = 0;//score first roll
        total=0;//score following rolls
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
        if (rollnum>1){
            total=getTotal();
        }

    }

    public boolean isNewGame() {
        return newGame;
    }

    public int getTotal() {
         return dice1.getValue() + dice2.getValue();
        
    }

    public int getPoint() {
        return point;
    }
    
  public boolean hasWon(){
      if(rollnum==1) {
          if(point==7|| point==11) {
              return true;
          }
          else return false;
          
       
      }else//if not first round
          if (total==point)
              return true;
          else return false;
     
  
   }
  public boolean hasLost(){
      if (rollnum==1){
          if (point==2||point==3||point==12)
              return true;
          else return false;}
      else//if not first rounf
          if (total==7)
              return true;
          else return false;
      
      }
  }
