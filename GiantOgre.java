//GiantOgre Class
//
//Matt Fishman
//2/13/2014
//
//Makes the giant and orge class fight each other to the death
public class GiantOgre
{
	public static void main (String[] args)
	{
		Giant bigGuy = new Giant(00.0, 0.0);
		Ogre meanGuy = new Ogre(00.0, 0.0);
		//makes the giant and orge

		meanGuy.setHealth(100);
		meanGuy.setStrength(15);

		bigGuy.setHealth(60);
		bigGuy.setStrength(25);

		//setting health and stregnth 
		
		
		while (meanGuy.isAlive() == true && bigGuy.isAlive() == true)
		{
		//while loop to have the ogres and giants fight
		double gAttack = (meanGuy.getHealth() - bigGuy.attack());
						
		double oAttack = (bigGuy.getHealth() - meanGuy.attack());
				
		//sets up the random attack

				 bigGuy.setHealth(oAttack);
				 meanGuy.setHealth(gAttack);
				
				//sets the new health

			System.out.println(oAttack + " " + gAttack); 
					//prints out the attack
					
					if(bigGuy.isAlive() == false && meanGuy.isAlive() == true)
					{
						System.out.println("Ogres win!");
						//checks if the ogres wins
					}
					else if (meanGuy.isAlive() == false && bigGuy.isAlive() == true)
					{
						System.out.println("Giants win!");
						//chekcs if giants win
					}
					else if (meanGuy.isAlive() == false && bigGuy.isAlive() == false)
					{
						
						System.out.println("The battle is a tie!");
						//checks if the battle is a tie
					}
			}
		
	}
}
