package menus;

import entities.Player;

public class Battle extends MenuBase {
	public Battle() {
		type = MenuType.ROOM;
		name = "Battle";
	}
	
	public void action(Player p) {
		System.out.println("Action not implimented yet.");
	}
}
