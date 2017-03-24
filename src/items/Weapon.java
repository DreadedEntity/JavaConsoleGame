package items;

public class Weapon extends ItemBase {
	protected int baseDamage;
	protected int elementalDamage;
	
	public void info() {
		System.out.println(name);
		System.out.println(description);
		System.out.println(baseDamage);
		System.out.println(elementalDamage);
	}
}
