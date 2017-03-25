package items;

public class Weapon extends ItemBase {
	private double baseDamage;
	protected double elementalDamage;
	
	public void info() {
		super.info();
		System.out.print("\tBaseDamage: " + getBaseDamage());
		System.out.print("\tElementalDamage: " + elementalDamage);
		System.out.println("");
	}

	public double getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(double baseDamage) {
		this.baseDamage = baseDamage;
	}

	public double getElementalDamage() {
		return elementalDamage;
	}

	public void setElementalDamage(double elementalDamage) {
		this.elementalDamage = elementalDamage;
	}
}
