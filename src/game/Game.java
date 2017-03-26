package game;

import entities.*;
import game_util.GameManager;
import rooms.*;

public class Game {
	public static void main(String[] args) {
		//StoryWriter story = new StoryWriter();
		
		Player p = new Player();
		Rat e = new Rat();
		
		RoomBase testRoom = new Test();
		testRoom.enter(p);
		
		//GameManager.battleSequence(p, e);
	}
	
}
