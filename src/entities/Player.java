package entities;

import items.Fist;

public class Player extends EntityBase {
	
	public Player() {
		vitality = 10;
		strength = 2;
		intelligence = 2;
		dexterity = 2;
		baseHealth = 10;

		maxHealth = vitality * 0.8 + baseHealth;
		currentHealth = maxHealth;
	
		weapon = new Fist();
		experience = 0;
	}

	@Override
	protected void attack(EntityBase e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void calculateStats() {
		// TODO Auto-generated method stub
		
	}
}
