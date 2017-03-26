package rooms;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Player;
import game_util.EnemyContainer;

public abstract class RoomBase {
	protected int type;
	protected String description;
	protected ArrayList<EnemyContainer> enemies;
	
	public int getType() {
		return type;
	}
	public ArrayList<EnemyContainer> getEnemyList() {
		return enemies;
	}
	public abstract void enter(Player p);
}
