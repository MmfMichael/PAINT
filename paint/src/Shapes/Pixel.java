package Shapes;

import java.awt.Point;

/**
 * @author campus
 *
 */
public class Pixel {
	
	private int x;
	private int y;
	private boolean isSelected=false;
	
	public Pixel() {
		this.x=1;
		this.y=1;
	}
	
	public Pixel(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public Pixel(Pixel pix) {
		this.x=pix.x;
		this.y=pix.y;
	}
	/*
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}*/
	
	public Point getLoc() {
		Point p = new Point(this.x,this.y);
		return p;
	}
	public void translate(int dx, int dy) {
		this.x=this.x+dx;
		this.y=this.x+dy;
	}
	
	public String toString() {
		return "x=" + x + "\ny="+y;
	}
	
	public void select() {
		this.isSelected=true;
	}
	
	public void unselect() {
		this.isSelected=false;
	}
	
	public void togleselect() {
		this.isSelected= !this.isSelected;
	}
	
	public static void main(String[] args) {
		Pixel p0 = new Pixel();
		Pixel p1 = new Pixel(8,2);
		Pixel p2 = new Pixel(p1);
		
		System.out.println(p0.getLoc());
        System.out.println(p2.getLoc());
        System.out.println(p3.getLoc());
        
        System.out.println(p0.getLoc());
        System.out.println(p0.isSelected());
        p0.unselect();
        System.out.println(p0.isSelected());
        p.toggleSelect();
        System.out.println(p0.isSelected());
        p0.select();
        
        // p0.translate(5, 6);
        // System.out.println(p0.getLoc());
	}
}
