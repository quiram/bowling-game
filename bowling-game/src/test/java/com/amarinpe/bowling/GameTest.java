package com.amarinpe.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest
{
	private Game g;
	
	@Before
	public void setup()
	{
		g = new Game();
	}
	
	@Test
	public void testGutterGame()
	{
		rollMany(20, 0);

		assertEquals(0, g.score());
	}

	@Test
	public void testAllOnes()
	{
		rollMany(20, 1);

		assertEquals(20, g.score());
	}

	private void rollMany(int n, int pins)
	{
		for (int i = 0; i < n; i++)
			g.roll(pins);
	}

}
