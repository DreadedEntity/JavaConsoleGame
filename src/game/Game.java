package game;

import java.util.Scanner;

import entities.*;
import items.*;

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
		System.out.println("You have entered combat with a " + e.getClass().getSimpleName());
		p.attack(e);
		e.attack(e);
	}
}
