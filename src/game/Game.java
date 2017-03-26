package game;

import java.util.ArrayList;
import java.util.Scanner;

import entities.*;
import items.*;
import menus.*;
import rooms.*;

public class Game {
	public static void main(String[] args) {
		//StoryWriter story = new StoryWriter();
		
		Player p = new Player();
		Rat e = new Rat();
		
		RoomBase testRoom = new Test();
		testRoom.enter(p);
		
		BattleSequence(p, e);
	}
	
	private static void BattleSequence(Player p, EntityBase e) {
		ArrayList<Integer> addedMenuItems = new ArrayList<Integer>();
		Scanner kb = new Scanner(System.in);
		addedMenuItems.add(p.addMenu(new Attack()));
		addedMenuItems.add(p.addMenu(new Flee()));
		
		System.out.println("You have entered combat with a " + e.getClass().getSimpleName());
		System.out.println(e.getMessage());
		while (e.getCurrentHealth() > 0) {
			double damage = -1;
			
			p.printMenu(MenuType.BATTLE);
			
			int option = 0;
			System.out.print("What will you do? ");
			while (option < 1 || option > Player.menu.size()) {
				if (kb.hasNextInt()) {
					option = kb.nextInt();
				} else {
					kb.next();
				}
			}
			System.out.println("");
			
			p.chooseMenu(option - 1, p, e);

			damage = e.attack(e);
			e.removeHealth(damage);
		}
		e.killed(p);
		
		for (int i = 0; i < p.menu.size(); i++) {
			p.removeMenu(0);
		}
		
		kb.close();
	}
}
