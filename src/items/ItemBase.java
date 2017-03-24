package items;

public abstract class ItemBase {
	protected String name;
	protected String description;
	
	public void info() {
		System.out.print("Name: " + name);
		System.out.print("\tDescription: " + description);
	}
}
