package entities;

import items.Fist;

public class Player extends EntityBase {
	
	public Player() {
		vitality = 1;
		strength = 1;
		intelligence = 1;
		dexterity = 1;
		baseHealth = 10;

		maxHealth = vitality * 0.8 + baseHealth;
		currentHealth = maxHealth;
	
		weapon = new Fist();
		experience = 0;
	}

	@Override
	public double attack(EntityBase e) {
		double damage = 0;
		damage = (strength * 2 * weapon.getBaseDamage()) +
				 (dexterity * 0.5 * weapon.getBaseDamage()) +
				 (intelligence * 0 * weapon.getBaseDamage());
		System.out.println("You attacked with " + weapon.getClass().getSimpleName() + " and dealt " + damage + " damage.");
		return damage;
	}

	@Override
	protected void calculateStats() {
		
	}
}
