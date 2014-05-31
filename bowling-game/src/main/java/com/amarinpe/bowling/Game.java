package com.amarinpe.bowling;

public class Game
{
	private int score = 0;
	
	void roll(int pins)
	{
		score += pins;
	}

	int score()
	{
		return score;
	}
}
