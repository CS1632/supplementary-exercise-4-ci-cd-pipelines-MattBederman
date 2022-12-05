package edu.pitt.cs;

public class RoundRobinPlayer implements Player {
	private int i = 0;
	public Hand throwHand() {
		// Returns rock, paper, scissors in round robin order
		Hand ret = Hand.values()[i];
		i = ++i % 3;
		return ret;
	}
}
