package menus;

import java.util.Scanner;

import entities.*;

public abstract class MenuBase {
	protected int type;
	protected String name;
	
	public int getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public abstract void action(Player p, EntityBase e);
}
