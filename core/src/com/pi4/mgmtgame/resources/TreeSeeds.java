package com.pi4.mgmtgame.resources;

public class TreeSeeds extends Grain {
	int growingTime = 1;
	int basePrice = 1;

	int getPrice() {
		return basePrice;
	}

	@Override
	int getGrowingTime() {
		return growingTime;
	}

	@Override
	Plant getGrownPlant() {
		return new Wood();
	}
}