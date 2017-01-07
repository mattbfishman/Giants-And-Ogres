//
//Matt Fishman
//2/6/2014
//
//Makes the Ogres class for the Gaints to fight 

import java.lang.Math;

public class Ogre
{
	//Instance variables

	private double ostrength = 25.0;
	private double ohealth = 60.0;

	//Constructors

	public Ogre(double intHealth, double intStrngth)
	{
		ohealth = intHealth;
		ostrength = intStrngth;

	}
	public double getStrength()
	{
		return ostrength;
	}

	public double getHealth()
	{
		return ohealth;
	}

	public void setStrength(double newStrength)
	{
		ostrength = newStrength;
	}

	public void setHealth(double newHealth)
	{
		ohealth = newHealth;
	}
	

	//methods
	public boolean isAlive()
	{
		if (ohealth > 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	//checks if the Ogre is alive
	public double attack()
	{
		return (Math.random()* ostrength);
	}
	//gets the attack value

	public double otakeDamage(double otakeDamage)
	{
			return ohealth - otakeDamage; 
	}
	//subtracts damage from health

}