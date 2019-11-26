package Lesson9.shapesv2;

import TurtleGraphics.Pen;
import java.awt.Color;

//abstract = can't make direct instance of shape
public abstract class Shape {

    protected double xPos, yPos;

  public Shape(double x, double y) {
        xPos = x;
        yPos = y;
    }

  public Shape() {
        xPos = 0;
        yPos = 0;
    }

    //like interface, children MUST implement it
    abstract double area();
    abstract double perimeter(); 
    abstract void draw(Pen p);

    abstract void stretchBy(double factor);

    //final methods can NEVER be over ridden by children classes
    final public double getXPos() {
        return xPos;
    }

   final  public double getYPos() {
        return yPos;
    }

    abstract void move(double xloc, double yloc) ;

  final   public void erase(Pen p) {
        p.setColor(Color.white);
        draw(p);
        p.setColor(Color.blue);
    }

    public String toString() {
        String str = "";
      //  str += "\nxPos: " + xPos;
      //  str += "\nyPos: " + yPos;
       // str += String.format("\nArea: %.2f", area());
     //  String str="X-Y Position =" + xPos+","+ yPos;
       str+= "\nArea="+ area();
       str+= "\nPerimeter=" + perimeter();
        return str;
    }
}
