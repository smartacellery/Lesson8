
package Lesson9.shapesv2.newpackage;

import TurtleGraphics.Pen;


public abstract class Shape {
    protected double xPos, yPos;
    
    
    
    public Shape(double x, double y){
        xPos=x;
        yPos=y;
    }
    
    
    //abstarcr method-> has no code
    //must be implemented by children
    //needs to be here so draw is not exclusive method
    abstract void draw(Pen p);
    public abstract void stretchBy(double newX, ) 
}
