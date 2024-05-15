public class Game {

	public static void main(String[] args) {
		//Enemy objects need to be made in the same class that uses the method that summons them.
		Enemy wolf = new Enemy ("Wolf", 100, new int[] {0, 2});
		wolf.spawnEnemy(wolf, 0);
		
	}
}
