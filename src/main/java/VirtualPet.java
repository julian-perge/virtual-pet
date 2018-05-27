
public class VirtualPet
{
	private int hunger = 0;
	private int thirst = 0;
	private int exhaustion = 0;
	
	VirtualPet(int hunger, int thirst, int exhaustion)
	{
		this.hunger = hunger;
		this.thirst = thirst;
		this.exhaustion = exhaustion;
	}

	public boolean isHungry(int hungerAmount)
	{
		if(hungerAmount >= 85)
		{
			return false;
		}
		
		return true;
	}
}
