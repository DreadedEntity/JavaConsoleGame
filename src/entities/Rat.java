package entities;

import items.Claw;

public class Rat extends EntityBase {
	
	public Rat() {
		vitality = 4;
		strength = 2;
		intelligence = 0;
		dexterity = 1;
		baseHealth = 5;
		maxHealth = baseHealth + (vitality * 0.5);
		currentHealth = maxHealth;
		weapon = new Claw();
		experience = 10;
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
