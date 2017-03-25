package game_util;

import entities.*;

public class GameManager {
	public static final int PLAYER = 0;
	public static final int RAT = 1;
	
	public static EntityBase createEnemy(EnemyContainer cont) {
		EntityBase newEnemy = new Rat(); //kinda wish I didn't have to initialize this, could cause memory leaks
		switch (cont.getNumber()) {
			case GameManager.PLAYER: newEnemy = new Player(); break;
			case GameManager.RAT: newEnemy = new Rat(); break;
			default: System.out.println("Enemy type not found, how did this happen? Default to: Rat."); break;
		}
		return newEnemy;
	}
}
