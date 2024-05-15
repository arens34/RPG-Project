
public class Enemy {
	private String name = " ";
	private int baseHP = 0;
	private int[] possibleSpawnBarks;
	//Constructor for basic information about enemies (objects of class Enemy)
	public Enemy (String name, int baseHP, int[] possibleSpawnBarks) {
		this.name = name;
		this.baseHP = baseHP;
		this.possibleSpawnBarks = possibleSpawnBarks;
	}
	
	//Enemy wolf = new Enemy ("Wolf", 100, new int[] {0, 2}); - Should probably be moved to "Combat".
	/*Enemies:
	 * Wolf
	 * Troll
	 * Ogre
	 * Dragon
	 * Frost spirit
	 */

	String[] spawnBarks = {
			"You feel a cold chill down your neck...", //0
			"You hear a sound from below...",
			"The howling in the distance grows louder...", //2
			"You feel the earth shake underneath you, and then a horrible bellow from behind..." //troll/ogre
	};

	public void spawnEnemy(Enemy enemy, int level) {
		int spawnBark = enemy.possibleSpawnBarks[0]; //Should be a random number, "1" for testing.
		System.out.println(spawnBarks[spawnBark]);
	}




/* To create simple spawnbarks:
 * Create array spawnbarks with different string messages
 * Make a String[] for possible spawnbarks for each enemy object
 * Pass the array into the enemy object
 * Each value of the array corresponds to an index of the "spawnbarks" array
 * Code that randomly generates which spawnbark will be used when the spawnEnemy()
 * method is used
 * (Possibly another method just for the spawn message?)
 */
/* String[] spawnBarks = 
 * {
 * 
 * 
 * 
 * 
 */

//What if i wanted to make this code, but for any enemy? (Instead of having to write wolf. )

/*
method spawnEnemy():

summons an enemy, only have to specify name and level
summons that enemy with the attributes they have been assigned,
but altered by their level
Because this method references an object of enemy, the object must be created in the same class that the method spawnEnemy() is being used (?)

public void spawnEnemy(Enemy enemy, int level) {

}
INSTEAD OF THIS:

just use the name of the enemy when using the method

wolf.spawnEnemy() -- better??
PROBLEM:
How do I store the attributes of each enemy and also summon them with those attributes (with some edited)?
*/
}