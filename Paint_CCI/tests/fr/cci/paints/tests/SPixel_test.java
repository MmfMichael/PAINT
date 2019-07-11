package fr.cci.paints.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SPixel_test {
    private final SPixel p = new SPixel();
    private final SPixel param = new SPixel(50, 54);
	
	

	@Test
	void testTranslateDefault() {
		p.translate(100, 100);
		assertEquals(new Point(101, 101), p.getLoc());
	}
	
	@Test
	void testTranslateAny() {
		param.translate(10, 10);
		assertEquals(new Point(60, 64), param.getLoc());
	}

	@Test
	void testSetLoc() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLoc() {
		assertEquals(1, p.getLoc().x);
		assertEquals(1, p.getLoc().y);
		assertEquals(new Point(1,1), p.getLoc());
		
		p.setLoc(50,39);
		assertEquals(new Point(50,39), p.getLoc());

	}

	@Test
	void testSPixel() {
		assertEquals(1, p.getLoc().x);
		assertEquals(1, p.getLoc().y);
		assertEquals(new Point(1,1), p.getLoc());
	}

	@Test
	void testSPixelIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testSPixelSPixel() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
