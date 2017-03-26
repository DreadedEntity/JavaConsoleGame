
package game_util;

import java.util.ArrayList;
import java.util.Random;

/* GameList class has been created to add extra functionality to the ArrayList class
 * Currently adds the following functionality:
 * 		Returning a random element from the GameList Object
 */

public class GameList<E> extends ArrayList<E> {
	public int getRandomElement() {
		Random r = new Random();
		int num = 0;
		
		r.nextInt(this.size());
		
		return num;
	}
}
