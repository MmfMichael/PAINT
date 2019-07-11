package fr.cci.paint.shapes;

import java.awt.Point;
import java.awt.Rectangle;

public class SRectangle extends Shape {
    
    //ATTRIBUTS:
    private SPixel origin=new SPixel();
    private int height=10;
    private int width=5;    
    
    //CONSTRUCTEURS:
    public SRectangle() {
        
    }
    
    public SRectangle(Point A, Point B) {    
        int minX,maxX,minY,maxY;
        if(A.getX()>B.getX()) {
            minX=B.x;
            maxX=A.x;
        }
        else {
            minX=A.x;
            maxX=B.x;
        }
        
        if(A.getY()>B.getY()) {
            minY=B.y;
            maxY=A.y;
        }
        else {
            minY=A.y;
            maxY=B.y;
        }
        
        this.origin=new SPixel(minX,maxY);
        this.height=maxY-minY;
        this.width=maxX-minX;
    }
        
    public SRectangle(Point loc, int width, int height) {
        this.origin=new SPixel(loc.x,loc.y);
        this.height=height;
        this.width=width;
    }
    
    public SRectangle(SRectangle rec) {
        this.origin=rec.origin;
        this.height=rec.height;
        this.width=rec.width;
    }
    
    //GETTERS & SETTERS:
    public int getHeight() {
        return this.height;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    
    
    //METHODES HERITEES:
    @Override
    public Point getLoc() {
        return this.origin.getLoc();
    }
    
    @Override
    public void setLoc(Point p) {
        this.origin.setLoc(p);        
    }
    
    @Override
    public void translate(int dx, int dy) {
        this.origin.translate(dx, dy);
    }

    @Override
    public Rectangle getBounds() {
        // TODO Auto-generated method stub
        return null;
    }
    
    
    
    
}