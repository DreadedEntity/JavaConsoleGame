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
		message = "The rat looks at you with beady black eyes.";
	}

	@Override
	public double attack(EntityBase e) {
		double damage = (strength * 1 * weapon.getBaseDamage()) +
				 (dexterity * 0.5 * weapon.getBaseDamage()) +
				 (intelligence * 0 * weapon.getBaseDamage());
		System.out.println(this.getClass().getSimpleName() + " attacked with " + weapon.getClass().getSimpleName() + " and dealt " + damage + " damage.");
		return damage;
	}

	@Override
	protected void calculateStats() {
		
	}
	
	public void killed(EntityBase entity) {
		super.killed(entity);
		System.out.println("You annihalated a nearly harmless rat.");
	}

}
