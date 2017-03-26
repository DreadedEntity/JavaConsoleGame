package menus;

import entities.Player;

public class LeaveRoom extends MenuBase {
	public LeaveRoom() {
		type = MenuType.ROOM;
		name = "Leave";
	}
	
	@Override
	public void action(Player p) {
		System.out.println("Test Action. Probably will not be implimented.");
	}
}
