//Giant Class
//
//Matt Fishman
//2/6/2014
//
//Makes the giant class for the ogres to fight 

import java.lang.Math;

public class Giant
{
	//Instance variables

	private double gstrength = 15.0;
	private double ghealth = 100.0;

	//Constructors

	public Giant(double intHealth, double intStrngth)
	{
		ghealth = intHealth;
		gstrength = intStrngth;

	}
	public double getStrength()
	{
		return gstrength;
	}

	public double getHealth()
	{
		return ghealth;
	}

	public void setStrength(double newStrength)
	{
		gstrength = newStrength;
	}

	public void setHealth(double newHealth)
	{
		ghealth = newHealth;
	}
	

	//methods
	public boolean isAlive()
	{
		if (ghealth > 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	//checks if the giant is alive
	public double attack()
	{
		return (gstrength * Math.random());
	}
	//gets the attack value

	public double gtakeDamage(double gtakeDamage)
	{
			return (gtakeDamage); 
	}
	//subtracts damage from health

}