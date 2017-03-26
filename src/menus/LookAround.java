package menus;

import entities.Player;

public class LookAround extends MenuBase {
	public LookAround() {
		type = MenuType.ROOM;
		name = "Look Around";
	}

	@Override
	public void action(Player p) {
		System.out.println("Action not implimented yet.");
	}
}
