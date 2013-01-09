package test;

import java.awt.Color;

import junit.framework.TestCase;
import lackhurt.util.images.ImageUtil;

public class Test extends TestCase {
	public void testDistance() {
		System.out.println(ImageUtil.getDistanceBetween(new Color(12, 12, 12), new Color(255, 13, 13)));
		assertTrue(true);
	}
}
