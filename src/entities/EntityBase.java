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
	protected String message;
	
	public abstract double attack(EntityBase e);
	protected abstract void calculateStats();
	
	public void killed(EntityBase entity) {
		entity.experience += experience;
		System.out.println(entity.getClass().getSimpleName() + " gained " + experience + " experience.");
	}
	
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
	public void addHealth(double health) {
		currentHealth += health;
	}
	public void removeHealth(double health) {
		currentHealth -= health;
	}
	
	public double getVitality() {
		return vitality;
	}
	public void setVitality(double vitality) {
		this.vitality = vitality;
	}
	public double getStrength() {
		return strength;
	}
	public void setStrength(double strength) {
		this.strength = strength;
	}
	public double getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(double intelligence) {
		this.intelligence = intelligence;
	}
	public double getDexterity() {
		return dexterity;
	}
	public void setDexterity(double dexterity) {
		this.dexterity = dexterity;
	}
	public double getBaseHealth() {
		return baseHealth;
	}
	public void setBaseHealth(double baseHealth) {
		this.baseHealth = baseHealth;
	}
	public double getMaxHealth() {
		return maxHealth;
	}
	public void setMaxHealth(double maxHealth) {
		this.maxHealth = maxHealth;
	}
	public double getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(double currentHealth) {
		this.currentHealth = currentHealth;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	public String getMessage() {
		return message;
	}
}
