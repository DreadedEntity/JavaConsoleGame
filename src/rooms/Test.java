package rooms;

import java.util.ArrayList;

import game_util.EnemyContainer;

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
}
