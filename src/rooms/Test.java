package rooms;

import java.util.ArrayList;

import game_util.EnemyContainer;

public class Test extends RoomBase {
	public Test(int type, ArrayList<EnemyContainer> enemies) {
		this.type = type;
		this.enemies = enemies;
	}
}
