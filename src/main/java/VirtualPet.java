public class VirtualPet
{
	public int hunger = 0;
	public int thirst = 0;
	public int sleep = 0;
	
	private int intMAX_ATTRIBUTE_VALUE = 100;
	private int intMIN_ATTRIBUTE_VALUE = 0;
	
	private int intCEILING_VALUE_OF_HUNGER = 80;
	private int intCEILING_VALUE_OF_THIRST = 80;
	private int intCEILING_VALUE_OF_SLEEP = 100;
	private int intMIN_VALUE_OF_SLEEP = 15;
//	private boolean isSatisfied = false;
	
	VirtualPet(int hunger, int thirst, int exhaustion)
	{
		this.hunger = hunger;
		this.thirst = thirst;
		this.sleep = exhaustion;
	}

	public boolean isHungry(int hungerLevel)
	{
		if(hungerLevel < intCEILING_VALUE_OF_HUNGER)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean isThirsty(int thirstLevel)
	{
		if (thirstLevel < intCEILING_VALUE_OF_THIRST)
		{
			return true;			
		}
		
		return false;
	}
	
	public boolean isSleepy(int sleepLevel)
	{
		if (sleepLevel <= intMIN_VALUE_OF_SLEEP)
		{
			return true;		
		}
		
		return false;
	}
	
	public int getHungerLevel(int hungerLevel)
	{
		return hungerLevel;
	}
	
	public int getThirstLevel(int thirstLevel)
	{
		return thirstLevel;
	}
	
	public int getSleepLevel(int sleepLevel)
	{
		return sleepLevel;
	}
}
