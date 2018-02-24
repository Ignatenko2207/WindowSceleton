package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Alex Ignatenko
 *
 */
public class MainWindowTest {

	@Test
	public void testReverseText() {
		MainWindow window = new MainWindow();
		String testReversedText = window.reverseText("some text");
		assertEquals("text some", testReversedText);
	}

}
