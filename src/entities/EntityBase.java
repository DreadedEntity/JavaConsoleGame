package entities;

import items.Weapon;

/* Base class template used to create all entities */

/* for copy/paste
vitality = 0;
strength = 0;
intelligence = 0;
dexterity = 0;
baseHealth = 0;
maxHealth = 0;
currentHealth = 0;
weapon = new Fist();
experience = 0;

damage = (strength * 2 * weapon.getBaseDamage()) +
				 (dexterity * 0.5 * weapon.getBaseDamage()) +
				 (intelligence * 0 * weapon.getBaseDamage());
*/

public abstract class EntityBase {
	protected double vitality;
	protected double strength;
	protected double intelligence;
	protected double dexterity;
	
	protected double baseHealth;
	protected double maxHealth;
	protected double currentHealth;
	
	protected Weapon weapon;
	
	protected double experience;
	
	public abstract double attack(EntityBase e);
	protected abstract void calculateStats();
	
	public void info() {
		System.out.println("Object: " + this.getClass().getSimpleName());
		System.out.print("Vitality: " + vitality);
		System.out.print("\tStrength: " + strength);
		System.out.print("\tIntelligence: " + intelligence);
		System.out.print("\tDexterity: " + dexterity);
		System.out.print("\tMaxHealth: " + maxHealth);
		System.out.print("\tCurrentHealth: " + currentHealth);
		System.out.print("\tExperience: " + experience);
		System.out.println("");
		weapon.info();
	}
}
