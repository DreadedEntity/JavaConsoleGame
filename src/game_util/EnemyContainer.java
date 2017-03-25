package game_util;

public class EnemyContainer {
	private int number;
	private int type;
	
	public EnemyContainer(int number, int type) {
		this.number = number;
		this.type = type;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getType() {
		return type;
	}
	
	public void decrementNumber() {
		number--;
	}
}
