package com.pd.core.patterns.structural.flyweight.example.wargame;

/**
 * Driver : War Game
 */
public class WarGameDemo {

    public static void main(final String[] args) {
	// start war

	// draw war terrain

	// create 5 soldiers:
	final SoldierClient warSoldiers[] = { new SoldierClient(), new SoldierClient(), new SoldierClient(),
		new SoldierClient(), new SoldierClient() };

	System.out.println("warSoldiers  0 :" + warSoldiers[0]);
	// move each soldier to his location
	// take user input to move each soldier
	warSoldiers[0].moveSoldier(17, 2112);

	System.out.println("warSoldiers  0 :" + warSoldiers[1]);
	// take user input to move each soldier
	warSoldiers[1].moveSoldier(137, 112);

	// note that there is only one SoldierImp ( flyweight Imp)
	// for all the 5 soldiers
	// Soldier Client size is small due to the small state it maintains
	// SoliderImp size might be large or might be small
	// however we saved memory costs of creating 5 Soldier representations

    }
}