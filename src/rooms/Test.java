package rooms;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Player;
import game_util.EnemyContainer;
import menus.*;

public class Test extends RoomBase {
	public Test(int type, ArrayList<EnemyContainer> arrayList) {
		this.type = type;
		this.description = "You enter a small square room. There are some rats scurrying about.";
		this.enemies = arrayList;
	}
	public Test() {
		type = 0;
		description = "You enter a small square room. There are some rats scurrying about.";
		enemies = new ArrayList<EnemyContainer>();
		enemies.add(new EnemyContainer(1, 2));
		
		
	}
	
	public void info() {
		
	}
	@Override
	public void enter(Player p) {
		Player.addRoomMenu(new LookAround());
		Player.addRoomMenu(new LeaveRoom());
		Player.addRoomMenu(new Battle());
		
		System.out.println(description);
		
		Scanner kb = new Scanner(System.in);
		int option = 0;

		Player.printRoomMenu();
		System.out.print("What will you do? ");
		while (option < 1 || option > Player.menuRoom.size()) {
			if (kb.hasNextInt()) {
				option = kb.nextInt();
			} else {
				kb.next();
			}
		}
		System.out.println("");
		
		Player.chooseRoomMenu(option - 1, p);
	}
}
