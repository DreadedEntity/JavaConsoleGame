package game_util;

import java.util.ArrayList;
import java.util.Scanner;

import entities.*;
import menus.Attack;
import menus.Flee;

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
	
	public static void battleSequence(Player p, EntityBase e) {
		ArrayList<Integer> addedMenuItems = new ArrayList<Integer>();
		Scanner kb = new Scanner(System.in);
		addedMenuItems.add(Player.addBattleMenu(new Attack()));
		addedMenuItems.add(Player.addBattleMenu(new Flee()));
		
		System.out.println("You have entered combat with a " + e.getClass().getSimpleName());
		System.out.println(e.getMessage());
		while (e.getCurrentHealth() > 0) {
			double damage = -1;
			
			Player.printBattleMenu();
			
			int option = 0;
			System.out.print("What will you do? ");
			while (option < 1 || option > Player.menuBattle.size()) {
				if (kb.hasNextInt()) {
					option = kb.nextInt();
				} else {
					kb.next();
				}
			}
			System.out.println("");
			
			Player.chooseBattleMenu(option - 1, p, e);

			damage = e.attack(e);
			e.removeHealth(damage);
		}
		e.killed(p);
		
		for (int i = 0; i < Player.menuBattle.size(); i++) {
			Player.removeBattleMenu(0);
		}
		
		kb.close();
	}
}
