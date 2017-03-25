package game;

import java.util.Scanner;

import entities.*;
import items.*;
import menus.*;

public class Game {
	public static void main(String[] args) {
		//StoryWriter story = new StoryWriter();
		
		Player p = new Player();
		//p.info();
		
		Rat e = new Rat();
		//e.info();
		
		BattleSequence(p, e);
	}
	
	private static void BattleSequence(Player p, EntityBase e) {
		Scanner kb = new Scanner(System.in);
		p.addMenu(new Attack());
		p.addMenu(new Flee());
		
		System.out.println("You have entered combat with a " + e.getClass().getSimpleName());
		System.out.println(e.getMessage());
		while (e.getCurrentHealth() > 0) {
			double damage = -1;
			
			p.printMenu(MenuType.BATTLE);
			
			int option = 0;
			System.out.print("What will you do? ");
			while (option < 1 || option > p.menu.size()) {
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
	}
}
