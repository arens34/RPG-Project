
public class Combat {
	boolean isPlayerTurn;
	boolean isEnemyTurn;
	Enemy wolf = new Enemy ("Wolf", 100, new int[] {0, 2});

//Any information that includes the enemy (enemy.name for example) can only be accessed if it is included
// as an argument (Enemy enemy)
//But what about information about the player?
	public void battle() {
		boolean enemyIsAlive = true;
		while (enemyIsAlive) {

		}
	}
}

/* The basic code for a turn based battle should be in one method
 * The information about the battle (enemy, enemy level etc.) should be seperate.
 */

/* CHATGPT SUGGESTION:
class Enemy {
private String name;
private int baseHP;

public Enemy(String name, int baseHP) {
    this.name = name;
    this.baseHP = baseHP;
}

public int getBaseHP() {
    return baseHP;
}

// Additional methods and properties can be added here
}

public class EnemySpawner {
public void spawnEnemy(Enemy enemy, int level) {
    System.out.println(enemy.getBaseHP());
    // Other logic for spawning an enemy at the specified level
}

public static void main(String[] args) {
    Enemy wolf = new Enemy("Wolf", 50);
    Enemy dragon = new Enemy("Dragon", 200);

    EnemySpawner spawner = new EnemySpawner();
    spawner.spawnEnemy(wolf, 3);
    spawner.spawnEnemy(dragon, 5);
}
}
*/