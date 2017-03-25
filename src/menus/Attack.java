package menus;

import entities.EntityBase;
import entities.Player;

public class Attack extends MenuBase {
	public Attack() {
		type = MenuType.BATTLE;
		name = "Attack";
	}

	public void action(Player p, EntityBase e) {
		double damage = 0;
		damage = p.attack(e);
		p.removeHealth(damage);
	}
}
