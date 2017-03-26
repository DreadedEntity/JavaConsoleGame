package menus;

import entities.EntityBase;
import entities.Player;

public abstract class MenuBase {
	protected int type;
	protected String name;
	
	public int getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	
	public void action(Player p, EntityBase e) {}
	public void action(Player p) {}
}
