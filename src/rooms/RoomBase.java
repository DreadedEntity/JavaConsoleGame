package rooms;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Player;
import game_util.EnemyContainer;

public class RoomBase {
	protected int type;
	protected String description;
	protected ArrayList<EnemyContainer> enemies;
	
	public int getType() {
		return type;
	}
	public ArrayList<EnemyContainer> getEnemyList() {
		return enemies;
	}
	public void enter(Player p) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println(description);
	}
}
