package items;

public class Weapon extends ItemBase {
	protected double baseDamage;
	protected double elementalDamage;
	
	public void info() {
		super.info();
		System.out.print("\tBaseDamage: " + baseDamage);
		System.out.print("\tElementalDamage: " + elementalDamage);
		System.out.println("");
	}
}
