package items;

public abstract class ItemBase {
	protected String name;
	protected String description;
	
	public void info() {
		System.out.print("Name: " + name);
		System.out.print("\tDescription: " + description);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
