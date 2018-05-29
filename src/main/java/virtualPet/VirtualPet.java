package virtualPet;
public class VirtualPet
{
	public int hunger = 0;
	public int fun = 0;
	public int energy = 0;
	private String name = "pet";
	
	private final int intMAX_ATTRIBUTE_VALUE = 100;
	
//	private final int intMIN_ATTRIBUTE_VALUE = 0;
	
	private final int MAX_PET_NAME_LENGTH = 16;
	
	private final int intSTATUS_EFFECT_VALUE = 80;
	
	private final int MIN_VALUE_OF_ENERGY_BEFORE_REST = 40;
	
	public VirtualPet(String newName, int hunger, int fun, int exhaustion)
	{
		name = newName;
		this.hunger = hunger;
		this.fun = fun;
		this.energy = exhaustion;
	}

	public boolean isHungry(int hungerLevel)
	{
		if(hungerLevel <= intSTATUS_EFFECT_VALUE)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean isBored(int funLevel)
	{
		if (funLevel <= intSTATUS_EFFECT_VALUE)
		{
			return true;			
		}
		
		return false;
	}
	
	public boolean hasLowEnergy(int energyLevel)
	{
		if (energyLevel <= MIN_VALUE_OF_ENERGY_BEFORE_REST)
		{
			return true;		
		}
		
		return false;
	}
	
	public boolean petNameIsGreaterThanMaxLength(String petNameLength)
	{
		if (petNameLength.length() <= MAX_PET_NAME_LENGTH)
		{
			return false;
		}

		return true;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getPetName() {
		return this.name;
	}
	
	public int getHungerLevel()
	{
		return this.hunger;
	}
	
	public void feed()
	{
		this.hunger += 15;
		if (this.hunger > intMAX_ATTRIBUTE_VALUE)
		{
			this.hunger = intMAX_ATTRIBUTE_VALUE;
		}		
	}
	
	public int getFunLevel()
	{
		return this.fun;
	}
	
	public void playWith()
	{
		this.fun += 15;
		if (this.fun > intMAX_ATTRIBUTE_VALUE)
		{
			this.fun = intMAX_ATTRIBUTE_VALUE;
		}		
	}
	
	public int getEnergyLevel()
	{
		return this.energy;
	}
	
	public void rest()
	{
		this.energy = intMAX_ATTRIBUTE_VALUE;
	}
	
	public void tick(int test)
	{
		switch (test) {
		// is fed
		case 1:
			this.fun -= 5;
			this.energy += 5;
			if (this.energy >= intMAX_ATTRIBUTE_VALUE)
			{
				this.energy = intMAX_ATTRIBUTE_VALUE;
			}
			break;
		// is played with
		case 2:
			this.hunger -= 5;
			this.energy -= 5;
			break;
		// has slept
		case 3:
			this.hunger -= 5;
			this.fun -= 5;
			break;
		// does nothing
		case 4:
			this.hunger -= 5;
			this.fun -= 5;
			this.energy -= 5;
			break;
		default:
			break;
		}
	}
}
