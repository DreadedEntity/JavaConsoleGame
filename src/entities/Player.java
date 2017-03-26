package entities;

import java.util.ArrayList;

import items.Fist;
import menus.MenuBase;

public class Player extends EntityBase {
	public static ArrayList<MenuBase> menuBattle = new ArrayList<MenuBase>();
	public static ArrayList<MenuBase> menuRoom = new ArrayList<MenuBase>();
	public static ArrayList<MenuBase> menuOverworld = new ArrayList<MenuBase>();
	
	public Player() {
		vitality = 1;
		strength = 1;
		intelligence = 1;
		dexterity = 1;
		baseHealth = 10;

		maxHealth = vitality * 0.8 + baseHealth;
		currentHealth = maxHealth;
	
		weapon = new Fist();
		experience = 0;
	}
	
	public static void chooseBattleMenu(int index, Player p, EntityBase e) {
		menuBattle.get(index).action(p, e);
	}
	public static void chooseRoomMenu(int index, Player p) {
		menuRoom.get(index).action(p);
	}
	
	public static void printBattleMenu() {
		for (int i = 0; i < menuBattle.size(); i++) {
			System.out.print((i+1) + ". " + menuBattle.get(i).getName() + "\t");
		}
		System.out.println("");
	}
	public static void printRoomMenu() {
		for (int i = 0; i < menuRoom.size(); i++) {
			System.out.print((i+1) + ". " + menuRoom.get(i).getName() + "\t");
		}
		System.out.println("");
	}
	public static void printOverworldMenu() {
		for (int i = 0; i < menuOverworld.size(); i++) {
			System.out.print((i+1) + ". " + menuOverworld.get(i).getName() + "\t");
		}
		System.out.println("");
	}
	
	public static int addBattleMenu(MenuBase newMenu) {
		menuBattle.add(newMenu);
		return (menuBattle.size() - 1);
	}
	public static void removeBattleMenu(int i) {
		menuBattle.remove(i);
	}
	public static int addRoomMenu(MenuBase newMenu) {
		menuRoom.add(newMenu);
		return (menuRoom.size() - 1);
	}
	public static void removeRoomMenu(int i) {
		menuRoom.remove(i);
	}
	public static int addOverworldMenu(MenuBase newMenu) {
		menuOverworld.add(newMenu);
		return (menuOverworld.size() - 1);
	}
	public static void removeOverworldMenu(int i) {
		menuOverworld.remove(i);
	}

	@Override
	public double attack(EntityBase e) {
		double damage = 0;
		damage = (strength * 2 * weapon.getBaseDamage()) +
				 (dexterity * 0.5 * weapon.getBaseDamage()) +
				 (intelligence * 0 * weapon.getBaseDamage());
		System.out.println("You attacked with " + weapon.getClass().getSimpleName() + " and dealt " + damage + " damage.");
		return damage;
	}

	@Override
	protected void calculateStats() {
		
	}

	@Override
	public void killed(EntityBase entity) {
		super.killed(entity);
		System.out.println("You were killed.");
	}
}
