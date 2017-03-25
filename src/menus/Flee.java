package menus;

import entities.*;

public class Flee extends MenuBase {
	public Flee() {
		type = MenuType.BATTLE;
		name = "Flee";
	}

	@Override
	public void action(Player p, EntityBase e) {
		System.out.println("Action is not implemented yet.");
	}
}
