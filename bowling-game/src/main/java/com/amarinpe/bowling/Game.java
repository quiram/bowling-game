package com.amarinpe.bowling;

public class Game
{
	private int[] rolls = new int[21];
	private int currentRoll = 0;

	void roll(int pins)
	{
		rolls[currentRoll++] = pins;
	}

	int score()
	{
		int score = 0;
		int frameIndex = 0;

		for (int frame = 0; frame < 10; frame++)
		{
			if (isSpare(frameIndex)) // spare
				score += 10 + rolls[frameIndex + 2];
			else
				score += rolls[frameIndex] + rolls[frameIndex + 1];

			frameIndex += 2;
		}

		return score;
	}

	private boolean isSpare(int frameIndex)
	{
		return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
	}
}
