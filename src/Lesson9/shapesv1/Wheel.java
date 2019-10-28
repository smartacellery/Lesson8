
package Lesson9.shapesv1;

import TurtleGraphics.Pen;

/**
 *
 * @author mart0010
 */
public class Wheel extends Circle {
    private int spokes;
    //Wheel 
    
    
    public Wheel(double x, double y, double r, int s){
        super(x,y,r);
        spokes=s;
    }
    //inherited methods are
        //draw will rely on paremt for part, but more will be added
        public void draw(Pen p){
            super.draw(p);//call parent draw method
            
            
            //now to draw the spoke
            for (int i = 0; i <= spokes; i++) {
                p.up();
                p.move(xPos, yPos);
                p.down();
                p.setDirection(i* (360/spokes));
                p.move(radius);
            }
        }//tosTRING WILL BE 
        public String toString() {
        String str = "Circle\n===================\n";
        str += "Xpos: " + xPos + "Ypos: " + yPos;
        str += "\nRadius: " + radius;
        str += String.format("\nArea: %.2f", spokes());
        return str;
    }
    }

