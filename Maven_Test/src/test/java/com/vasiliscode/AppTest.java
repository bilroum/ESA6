package com.vasiliscode;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void returnTrue() {
		Applikation app = new Applikation();
		assertTrue(app.sample());
	}

}
