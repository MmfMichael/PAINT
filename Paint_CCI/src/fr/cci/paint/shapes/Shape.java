package fr.cci.paint.shapes;

import java.awt.Point;
import java.awt.Rectangle;

public abstract class Shape {
    //ATTRIBUTS:
    private boolean isSelected=false;
    
    //GETTERS & SETTERS:
    public boolean isSelected() {
        return this.isSelected;
    }
    
    public abstract Point getLoc();
    
    public abstract void setLoc(Point p);
    
    //METHODES:
    public abstract void translate(int dx, int dy);
    
    public abstract Rectangle getBounds();
    
    public void select() {
        this.isSelected=true;
    }
    
    public void unSelect() {
        this.isSelected=false;
    }
    
    public void toggleSelection() {
        this.isSelected=!this.isSelected;
    }
    
    
}