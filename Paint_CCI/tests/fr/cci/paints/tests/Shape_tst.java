package fr.cci.paints.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

import org.junit.jupiter.api.Test;

import IHM.visitor.ShapeVisitor;
import junit.framework.TestCase;

class Shape_tst extends TestCase{

	// classe crée pour tester les méthodes propes à shape (selection
	private class MockShape extends SShape{

		//obligation de donner un code à toutes les méthodes pour instancier la classe donc on les laisse vides
		@Override
		public void print() {}// TODO Auto-generated method stub

		@Override
		public Point getLoc() {	return null;}

		@Override
		public void setLoc(Point p) {}

		@Override
		public void translate(int dx, int dy) {}

		public Rectangle getBounds() { return null;	}

		@Override
		public void setLoc(int x, int y) {}

		@Override
		public void draw(Graphics g) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void accept(ShapeVisitor v) {
			// TODO Auto-generated method stub
			
		}
	}
	
	////////toString test
	@Test
	void Given_notSelectedShape_When_toString_Then_provideText() {
		MockShape s = new MockShape();
		assertEquals("isSelected=false", s.toString());
	}
	
	@Test
	void Given_selectedShape_When_toString_Then_provideText() {
		MockShape s = new MockShape();
		s.select();
		assertEquals("isSelected=true", s.toString());
	}
	
	////////default value test
	@Test
	void Given_Nothing_When_NewRectangle_Then_isNotSelected(){
		MockShape s = new MockShape();
		assertFalse(s.isSelected());
	}
	
	////////select tests
	@Test
	void Given_notSelectedShape_When_select_Then_isSelected(){
		MockShape s = new MockShape();
		assertFalse(s.isSelected());
		s.select();
		assertTrue(s.isSelected());
	}
	
	@Test
	void Given_selectedShape_When_select_Then_isSelected(){
		MockShape s = new MockShape();
		s.select();
		assertTrue(s.isSelected());
		s.select();
		assertTrue(s.isSelected());
	}
	
	////////unselect tests
	@Test
	void Given_notSelectedShape_When_unselect_Then_isNotSelected(){
		MockShape s = new MockShape();
		assertFalse(s.isSelected());
		s.deselect();
		assertFalse(s.isSelected());
	}
	
	@Test
	void Given_selectedShape_When_unselect_Then_isNotSelected(){
		MockShape s = new MockShape();
		s.select();
		assertTrue(s.isSelected());
		s.deselect();;
		assertFalse(s.isSelected());
	}
	
	////////toggles tests
	@Test
	void Given_notSelectedShape_When_toggle_Then_isSelected(){
		MockShape s = new MockShape();
		s.toggleSelection();;
		assertTrue(s.isSelected());
	}

	@Test
	void Given_selectedShape_When_toggle_Then_isNotSelected(){
		MockShape s = new MockShape();
		s.select();
		s.toggleSelection();
		assertFalse(s.isSelected());
	}

}
