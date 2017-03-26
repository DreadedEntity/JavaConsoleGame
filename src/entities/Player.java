package entities;

import java.util.ArrayList;
import java.util.Scanner;

import items.Fist;
import menus.MenuBase;

public class Player extends EntityBase {
	public static ArrayList<MenuBase> menu = new ArrayList<MenuBase>();
	
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
	
	public void chooseMenu(int index, Player p, EntityBase e) {
		menu.get(index).action(p, e);
	}
	
	public void printMenu(int type) {
		for (int i = 0; i < menu.size(); i++) {
			if (type == menu.get(i).getType()) {
				System.out.print((i+1) + ". " + menu.get(i).getName() + "\t");
			}
		}
		System.out.println("");
	}
	
	public int addMenu(MenuBase newMenu) {
		menu.add(newMenu);
		return (menu.size() - 1);
	}
	public void removeMenu(int i) {
		menu.remove(i);
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
